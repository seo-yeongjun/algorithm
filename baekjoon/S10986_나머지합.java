package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10986
public class S10986_나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long len = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[(int) a];
        long answer = 0;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            long num = Long.parseLong(st.nextToken());
            sum += num;
            if (sum % a == 0)
                answer++;
            arr[(int) (sum % a)]++;
        }
        for (int i = 0; i < a; i++){
            answer+= arr[i]*(arr[i]-1)/2;
        }
            System.out.print(answer);
    }
}
