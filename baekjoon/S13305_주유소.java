package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/13305
public class S13305_주유소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine()) - 1;
        long[] len = new long[num];
        long answer = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++)
            len[i] = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        answer += min * len[0];
        for (int i = 1; i < num; i++) {
            long p = Long.parseLong(st.nextToken());
            if (p < min) {
                min = p;
            }
            answer += len[i] * min;
        }
        System.out.print(answer);
    }
}