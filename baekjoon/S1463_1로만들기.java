package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
DP 문제를 풀때는 먼저 테이블을 정의 하고, 점화식을 찾고, 초기 값을 정한다.
 */
public class S1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int goal = Integer.parseInt(br.readLine());
        int[] arr = new int[goal + 1];
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i < goal + 1; i++) {
            arr[i] = arr[i - 1] + 1;
            if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i / 2] + 1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
