package baekjoon;

import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/1620
public class S1620_나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        for (int i = 0; i < max; i++){
            String name = br.readLine();
            map1.put(String.valueOf(i+1), name);
            map2.put(name,String.valueOf(i+1));
        }
        for (int i = 0; i < num; i++) {
            String line = br.readLine();
            if (map1.containsKey(line))
                bw.write(map1.get(line)+"\n");
            else
                bw.write(map2.get(line)+"\n");
        }
        bw.flush();
    }
}
