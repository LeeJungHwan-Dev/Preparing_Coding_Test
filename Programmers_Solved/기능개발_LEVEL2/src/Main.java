import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = {};

        int index = 0;
        int count = 0;
        ArrayList<Integer> answerList = new ArrayList<>();

        ArrayDeque<HashMap<Integer,Integer>> jobQue = new ArrayDeque<>();
        ArrayDeque<Integer> devQue = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(i,progresses[i]);
            jobQue.addLast(map);
        }
        for (int i : speeds){
            devQue.addLast(i);
        }

        while (!jobQue.isEmpty()){
            HashMap<Integer,Integer> job = jobQue.removeFirst();
            Set<Integer> set = job.keySet();
            int[] nowIndex = set.stream().mapToInt(Integer::intValue).toArray();
            int speed = devQue.removeFirst();

            if(job.get(nowIndex[0]).intValue() >= 100 && index == nowIndex[0]){
                index++;
                count++;

                int size = jobQue.size();
                for (int i = 0; i < size; i++){
                    HashMap<Integer,Integer> job2 = jobQue.removeFirst();
                    Set<Integer> set2 = job2.keySet();
                    int[] nowIndex2 = set2.stream().mapToInt(Integer::intValue).toArray();
                    int num2 = devQue.removeFirst();

                    if(job2.get(nowIndex2[0]).intValue() >= 100 && index == nowIndex2[0]){
                        index++;
                        count++;
                    }else{
                        job2.put(nowIndex2[0],job2.get(nowIndex2[0])+num2);
                        jobQue.addLast(job2);
                        devQue.addLast(num2);

                        break;
                    }
                }
                answerList.add(count);
                count = 0;
            }else{
                job.put(nowIndex[0],job.get(nowIndex[0]) + speed);
                jobQue.addLast(job);
                devQue.addLast(speed);
            }

        }

        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i ++){
            answer[i] = answerList.get(i);
        }

        for (int i : answer){
            System.out.print(i + " ");
        }

    }
}