package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1931
public class S1931_회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();
        int[][] table = new int[testNum][2];
        for (int i = 0; i < testNum; i++) {
            table[i][0] = sc.nextInt();
            table[i][1] = sc.nextInt();
        }
        Arrays.sort(table, (int[] o1, int[] o2) -> {
            if (o1[1] == o2[1])
                return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        int e = table[0][1];
        int answer = 0;
        for (int i = 1; i < testNum; i++) {
            if (table[i][0] >= e) {
                answer++;
                e = table[i][1];
            }
        }
        System.out.print(answer + 1);
    }
}
