package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/16139
public class S16139_인간컴퓨터상호작용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str = br.readLine();
        int[][] arr = new int[26][str.length() + 1];
        for (int i = 1; i < str.length() + 1; i++) {
            for (int j = 0; j < 26; j++) {
                arr[j][i] = arr[j][i - 1];
            }
            arr[(int) str.charAt(i - 1) - 97][i] = arr[(int) str.charAt(i - 1) - 97][i - 1] + 1;
        }
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int c = st.nextToken().charAt(0) - 97;
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            bw.write(arr[c][e + 1] - arr[c][s] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}