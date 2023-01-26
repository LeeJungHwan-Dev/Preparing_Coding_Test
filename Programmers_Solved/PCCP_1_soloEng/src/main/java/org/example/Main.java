import java.util.HashMap;

class Solution {
    public String solution(String input_string) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < input_string.length(); i++){
            map.put(String.valueOf(input_string.charAt(i)), 1 );
        }

        for(int i = 0; i < input_string.length(); i++) {
            try {
                if (!(String.valueOf(input_string.charAt(i)).equals(String.valueOf(input_string.charAt(i + 1))))) {
                    map.put(String.valueOf(input_string.charAt(i)), map.get(String.valueOf(input_string.charAt(i))) + 1);
                }
            }catch (Exception e) {
                map.put(String.valueOf(input_string.charAt(i)), map.get(String.valueOf(input_string.charAt(i))) + 1);
            }
        }

        for(String key : map.keySet()){
            if(map.get(key)-1 >= 2){
                answer += key;
            }
        }


        return (answer.length() == 0 ) ? "N":answer;
    }
}
