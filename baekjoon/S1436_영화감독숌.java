package baekjoon;
//https://www.acmicpc.net/problem/1436

import java.util.Scanner;

public class S1436_영화감독숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int n = 0;
        int i = 1;
        while (n != arr.length) {
            if (String.valueOf(i).contains("666"))
                arr[n++] = i;
            i++;
        }
        System.out.print(arr[arr.length-1]);
    }
}
