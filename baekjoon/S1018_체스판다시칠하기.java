package baekjoon;
//https://www.acmicpc.net/problem/1018

import java.util.Scanner;

public class S1018_체스판다시칠하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 64;
        int x = sc.nextInt();
        int y = sc.nextInt();
        char[][] xy = new char[x][y];
        String bf = "BWBWBWBW";
        String wf = "WBWBWBWB";
        char[][] 기본1 = new char[8][8];
        char[][] 기본2 = new char[8][8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                int idx = 0;
                for (char c : bf.toCharArray())
                    기본1[i][idx++] = c;
                idx = 0;
                for (char c : wf.toCharArray())
                    기본2[i][idx++] = c;
            } else {
                int idx = 0;
                for (char c : wf.toCharArray())
                    기본1[i][idx++] = c;
                idx = 0;
                for (char c : bf.toCharArray())
                    기본2[i][idx++] = c;
            }
        }
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            char[] line = sc.nextLine().toCharArray();
            int idx = 0;
            for (char c : line) {
                xy[i][idx++] = c;
            }
        }
        int xm = x - 8;
        int ym = y - 8;

        int count1 = 0;
        int count2 = 0;
        for (int xj = 0; xj <= xm; xj++) {
            for (int yj = 0; yj <= ym; yj++) {
                for (int xg = 0; xg < 8; xg++) {
                    for (int yg = 0; yg < 8; yg++) {
                        if ((기본1[xg][yg] != xy[xg + xj][yg + yj]))
                            count1++;
                        if ((기본2[xg][yg] != xy[xg + xj][yg + yj]))
                            count2++;
                    }
                }
                if (Integer.min(count1, count2) < answer)
                    answer = Integer.min(count1, count2);
                count1 = 0;
                count2 = 0;
            }
        }
        System.out.print(answer);
    }
}
