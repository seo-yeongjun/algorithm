package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/14425

public class S14425_문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[] 보유 = new String[a];

        for (int i = 0; i < 보유.length; i++)
            보유[i] = br.readLine();
        for (int i = 0; i < b; i++) {
            String 비교 = br.readLine();
            if (Arrays.asList(보유).contains(비교)) {
                answer++;
            }
        }
        br.close();
        System.out.print(answer);
    }
}
