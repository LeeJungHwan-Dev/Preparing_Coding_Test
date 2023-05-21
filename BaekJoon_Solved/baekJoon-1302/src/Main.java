import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();


        int count = Integer.parseInt(bf.readLine());

        for (int i=0; i < count; i++){
            String name = bf.readLine();

            if (map.containsKey(name)){
                map.put(name,map.get(name)+1);
            }else{
                map.put(name,0);
            }
        }

        List<Integer> max = new ArrayList<>(map.values());
        Collections.sort(max,Collections.reverseOrder());

        ArrayList<String> maxList = new ArrayList<>();

        for (String name : map.keySet()){
            if (map.get(name) == max.get(0)){
                maxList.add(name);
            }
        }

        Collections.sort(maxList);

        for (String name : maxList){
            str.append(name+"\n");
            break;
        }

        bw.write(str.toString());
        bf.close();
        bw.close();
    }
}