package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1004
public class S1004_어린왕자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            int answer = 0;

            st = new StringTokenizer(br.readLine());

            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int gx = Integer.parseInt(st.nextToken());
            int gy = Integer.parseInt(st.nextToken());

            int 행성수 = Integer.parseInt(br.readLine());

            for (int j = 0; j < 행성수; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                double v = Math.pow(x - sx, 2) + Math.pow(y - sy, 2);
                double v1 = Math.pow(r, 2);
                double v2 = Math.pow(x - gx, 2) + Math.pow(y - gy, 2);
                if ((v1> v && v1 <= v2) || (v1 <= v && v1 > v2))
                    answer++;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
    }
}