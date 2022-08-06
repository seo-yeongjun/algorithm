package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2580
public class S2580_스도쿠 {
    static int[][] board = new int[9][9];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }
        solution(0, 0);
    }

    static void solution(int x, int y) throws IOException {
        if (y == 9) {
            for (int[] arr : board) {
                for (int a : arr)
                    bw.write(a + " ");
                bw.write("\n");
            }
            bw.flush();
            System.exit(0);
        }
        if (x == 9) {
            solution(0, y + 1);
            return;
        }
        if (board[y][x] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (posible(x, y, i)) {
                    board[y][x] = i;
                    solution(x + 1, y);
                }
            }
            board[y][x] = 0;
            return;
        }
        solution(x + 1, y);
    }

    static boolean posible(int x, int y, int i) {
        for (int n = 0; n < 9; n++) {
            if (board[y][n] == i) return false;
            if (board[n][x] == i) return false;
        }
        for (int yy = (y / 3) * 3; yy < ((y / 3) * 3) + 3; yy++) {
            for (int xx = (x / 3) * 3; xx < ((x / 3) * 3) + 3; xx++) {
                if (board[yy][xx] == i) return false;
            }
        }
        return true;
    }
}
