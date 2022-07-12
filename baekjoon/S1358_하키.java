package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1358
public class S1358_하키 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();

        int r = h / 2;

        int y1 = y + r;
        int x2 = x + w;

        int answer = 0;

        for (int i = 0; i < p; i++) {
            int px = sc.nextInt();
            int py = sc.nextInt();
            if ((Math.pow(r, 2) >= (Math.pow(x - px, 2) + Math.pow(y1 - py, 2))) || (Math.pow(r, 2) >= (Math.pow(x2 - px, 2) + Math.pow(y1 - py, 2))) || ((x <= px && px <= x2) && (y <= py && py <= y + h))) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}