package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11660
public class S11660_구간합구하기5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int testNum = Integer.parseInt(st.nextToken());
        int[][] arr = new int[len + 1][len + 1];
        for (int i = 1; i < len + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < len + 1; j++) {
                arr[i][j] = arr[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < testNum; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int answer = 0;
            for (int j = x1; j <= x2; j++) {
                answer += arr[j][y2] - arr[j][y1 - 1];
            }
            bw.write(answer + "\n");
        }
        bw.flush();
    }
}
