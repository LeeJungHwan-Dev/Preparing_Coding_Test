import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        String[] opCode = sc.nextLine().split(" ");
        int size = Integer.valueOf(opCode[0]);
        int delCount = Integer.valueOf(opCode[1]);

        String[] list = sc.nextLine().split("");
        sc.close();

        for(int i = 0; i < size; i++){
            while (delCount > 0 && !(deque.isEmpty()) && deque.getLast() < Integer.valueOf(list[i])){
                deque.removeLast();
                delCount--;
            }
            deque.addLast(Integer.valueOf(list[i]));
        }

        for(int i =0; i < size - Integer.valueOf(opCode[1]); i++){
            System.out.print(deque.poll());
        }

    }

}
