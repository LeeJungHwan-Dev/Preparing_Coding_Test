import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        String s = "()()((";
        ArrayDeque<Character> list = new ArrayDeque<>();

        int size = s.length();
        for (int i = 0; i < size; i ++){
            if (list.size() == 0) {
                list.push(s.charAt(i));
            }else{
                if (list.peek() == '(' && s.charAt(i) == ')'){
                    list.pop();
                }else{
                    list.push(s.charAt(i));
                }
            }
        }

        if (list.size() > 0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }

    }
}