package baekjoon;
//https://www.acmicpc.net/problem/10989

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10989_수정렬하기3 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < 10001; i++) {
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
