package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1541
public class S1541_잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = 0;
        int index = str.indexOf('-');
        StringTokenizer st;
        if (index == -1) {
            st = new StringTokenizer(str, "-+");
        } else {
            st = new StringTokenizer(str.substring(index), "-+");
            while (st.hasMoreTokens()) {
                answer -= Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(str.substring(0, index), "+");
        }
        while (st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }
        System.out.print(answer);
    }
}