package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1002
public class S1002_터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                bw.write(-1 + "\n");
            } else if (Math.pow(r2 - r1,2) < d && d < Math.pow(r1 + r2,2))
                bw.write(2 + "\n");
            else if (Math.pow(r1 + r2,2) == d || Math.pow(r2 - r1,2) == d)
                bw.write(1 + "\n");
            else
                bw.write(0 + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
