package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1343
public class S1343_폴리오미노 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "AAAA";
        String b = "BB";
        String board = sc.nextLine();
        board = board.replaceAll("XXXX", a);
        board = board.replaceAll("XX", b);
        if (board.contains("X")) {
            System.out.println(-1);
        } else
            System.out.print(board);
    }
}
