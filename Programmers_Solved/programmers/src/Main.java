import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int num = 10000;
        int number = 0;

        while (num-- != 0) {
            number++;
            String numbers = String.valueOf(number);
            int num1 = Integer.parseInt(numbers);

            for (int i = 0; i < numbers.length(); i++) {
                for (int i2 = i + 1; i2 <= numbers.length(); i2++) {
                    num1 += Integer.parseInt(numbers.substring(i, i2));
                    list.add(num1);
                    break;
                }
            }
        }
        System.out.println(list);

        for (int i = 0; i<list.size(); i++){
            for (int i2 = list.get(i); i2 < list.get(i+1); i2++){
                System.out.println(list.get(i) + " / " + list.get(i+1));
                //System.out.println(i2);
            }
        }

    }
}