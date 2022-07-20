package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2630
public class S2630_색종이만들기 {
    static int[][] arr;
    static int blue = 0;
    static int white = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < num; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution(0, 0, arr.length);
        System.out.println(blue);
        System.out.println(white);
    }

    public static void solution(int x, int y, int lenth) {
        boolean tmp = false;
        int color = arr[x][y];
        for (int i = 0; i < lenth; i++) {
            for (int j = 0; j < lenth; j++) {
                if (arr[i + x][j + y] != color) {
                    tmp = true;
                    break;
                }
            }
            if (tmp) break;
        }
        if (!tmp) {
            if (color == 0) blue++;
            else white++;
        } else {
            int len = lenth / 2;
            solution(x, y, len);
            solution(x + len, y, len);
            solution(x, y + len, len);
            solution(x + len, y + len, len);
        }
    }
}