package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2609
public class S2609_최대공약수와최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 0, max = 0;
        for (int i = b; ; i--) {
            if (a % i == 0 && b % i == 0) {
                min = i;
                break;
            }
        }
        for (int i = min; ; i += min) {
            if (i % a == 0 && i % b == 0) {
                max = i;
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}