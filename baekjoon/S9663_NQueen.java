package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9663
public class S9663_NQueen {
    static int[] board;
    static int num;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        board = new int[num];
        solution(0);
        System.out.println(answer);
    }

    static void solution(int depth) {
        if (num == depth) {
            answer++;
            return;
        }
        for (int i = 0; i < num; i++) {
            board[depth] = i;
            if (posible(depth)) {
                solution(depth + 1);
            }
        }
    }

    static boolean posible(int idx) {
        for (int i = 0; i < idx; i++) {
            if (board[i] == board[idx]) return false;
            else if (Math.abs(idx - i) == Math.abs(board[idx] - board[i])) return false;
        }
        return true;
    }
}
