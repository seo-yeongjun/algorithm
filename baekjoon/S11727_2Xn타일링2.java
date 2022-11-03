package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S11727_2Xn타일링2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num + 1; i++) {
            if (i % 2 == 0) arr[i] = (Arrays.stream(arr).sum() + 2) % 10007;
            else arr[i] = (Arrays.stream(arr).sum() + 1) % 10007;
        }
        System.out.println(arr[num]);
    }
}
