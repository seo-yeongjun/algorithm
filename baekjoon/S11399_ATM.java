package baekjoon;
//https://www.acmicpc.net/problem/11399

import java.util.Arrays;
import java.util.Scanner;

public class S11399_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            answer += arr[i] * (n - i);
        }
        System.out.println(answer);
    }
}
