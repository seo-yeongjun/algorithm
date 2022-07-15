package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2559
public class S2559_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int sumNum = Integer.parseInt(st.nextToken());
        int max;
        int sum = 0;
        int[] arr = new int[len];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < sumNum; i++) {
            sum += arr[i];
        }
        max = sum;
        for (int i = 0; i < len - sumNum; i++) {
            sum -= arr[i];
            sum += arr[i + sumNum];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
