package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/4153
public class S4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr = new int[3];
        while (true) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;
            Arrays.sort(arr);
            if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2))
                bw.write("right\n");
            else
                bw.write("wrong\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
