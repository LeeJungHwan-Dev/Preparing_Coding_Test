import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        HashMap<String,LinkedList<Integer>> music = new HashMap<>(); // 큰 음악순으로 담을 Map
        HashMap<String,Integer> max = new HashMap<>();
        HashMap<Integer,LinkedList<Integer>> index = new HashMap<>();

        for (int i = 0; i < plays.length; i++){
            if (index.containsKey(plays[i])){
                index.get(plays[i]).add(i);
            }else{
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i);
                index.put(plays[i],list);
            }
        }

        for (int i = 0; i < genres.length; i++){
            String name = genres[i];
            if (music.containsKey(name)){
                music.get(name).offer(plays[i]);
                max.put(name,max.get(name)+plays[i]);
            }else{
                LinkedList<Integer> list = new LinkedList<>();
                list.add(plays[i]);
                music.put(name,list);
                max.put(name,plays[i]);
            }
        }

        for (String s : music.keySet()){
            Collections.sort(music.get(s), new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    return Integer.compare(t1,integer);
                }
            });
        }

        List<String> valueList = new ArrayList<>(max.keySet());
        Collections.sort(valueList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return Integer.compare(max.get(t1),max.get(s));
            }
        });



        for (String s : valueList){ // 가장 큰 음악 리스트
            int count = 0;
            for (int i : music.get(s)){ // 음악 리스트에서 플레이 리스트
                for (int i2 : index.get(i)){
                    if (count == 2) {
                        break;
                    }else{
                       answer.add(i2);
                        count++;
                    }

                }
            }
        }


    }
}