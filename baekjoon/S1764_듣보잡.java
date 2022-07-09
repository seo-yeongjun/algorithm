package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1764
public class S1764_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int 듣 = Integer.parseInt(st.nextToken());
        int 보 = Integer.parseInt(st.nextToken());
        int 듣보 = 0;
        String[] answer = new String[보];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 듣; i++)
            set.add(br.readLine());
        for (int i = 0; i < 보; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                answer[듣보]= name;
                듣보++;
            }
        }
        br.close();
        answer = Arrays.copyOf(answer,듣보);
        Arrays.sort(answer);
       bw.write(듣보+"\n");
        for(String s:answer)
            bw.write(s+"\n");
        bw.flush();
        bw.close();
    }
}

