package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/5086
public class S5086_배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a, b;
        do {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0)
                break;
            if (a % b == 0)
                bw.write("multiple\n");
            else if (b % a == 0)
                bw.write("factor\n");
            else
                bw.write("neither\n");
        } while (true);
        br.close();
        bw.flush();
        bw.close();
    }
}