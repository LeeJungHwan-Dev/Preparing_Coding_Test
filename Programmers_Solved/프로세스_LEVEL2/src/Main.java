import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int count = 1;
        int max = Arrays.stream(priorities).max().getAsInt();

        ArrayDeque<Integer> processesList = new ArrayDeque<>();
        ArrayDeque<Integer> index = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i ++){
            processesList.add(priorities[i]);
            index.add(i);
        }

        while (!processesList.isEmpty()){
            int process = processesList.removeFirst();
            int itemIndex = index.removeFirst();

            if (process == max && itemIndex == location){
                System.out.println(count);
            }else if (process == max){
                if (!processesList.isEmpty()) {
                    max = Collections.max(processesList);
                }
                count++;
            }else{
                processesList.addLast(process);
                index.addLast(itemIndex);
            }
        }


    }
}