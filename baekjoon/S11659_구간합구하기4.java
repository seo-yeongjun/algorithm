package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11659
public class S11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrNum = Integer.parseInt(st.nextToken());
        int testNum = Integer.parseInt(st.nextToken());

        int[] arr = new int[arrNum + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < arrNum+1; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < testNum; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            bw.write(arr[end] - arr[start - 1]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}