import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str = new StringBuilder();

        HashMap<String,String> map = new HashMap<>();

        String[] command = bf.readLine().split(" ");

        for (int i = 0; i < Integer.parseInt(command[0]); i++){
            String[] idInfo = bf.readLine().split(" ");
            map.put(idInfo[0],idInfo[1]);
        }

        for (int i = 0; i < Integer.parseInt(command[1]); i ++){
            String webSite = bf.readLine();

            str.append(map.get(webSite)+"\n");
        }

        bw.write(str.toString());

        bf.close();
        bw.close();
    }
}