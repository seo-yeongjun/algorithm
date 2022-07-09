package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/10815
public class S10815_숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] 보유 = new Integer[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 보유.length; i++)
            보유[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(보유);
        int 비교 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 비교; i++) {
            if (Arrays.binarySearch(보유, Integer.parseInt(st.nextToken())) >= 0)
                bw.write("1 ");
            else
                bw.write("0 ");
        }
        br.close();
        bw.close();
    }
}
