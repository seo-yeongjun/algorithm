package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1934
public class S1934_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < testNum; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = a * b;
            while (b > 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
            bw.write(answer / a + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}