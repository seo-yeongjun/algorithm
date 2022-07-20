package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1992
public class S1992_쿼드트리 {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        arr = new int[len][len];
        for (int i = 0; i < len; i++) {
            String str = br.readLine();
            for (int j = 0; j < len; j++) {
                arr[i][j] = str.charAt(j) - 48;
            }
        }
        quadtree(0, 0, len);
        System.out.print(sb.toString());
    }

    static void quadtree(int x, int y, int lenth) {
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
            sb.append(color);
        } else {
            int len = lenth / 2;
            sb.append('(');
            quadtree(x, y, len);
            quadtree(x, y + len, len);
            quadtree(x + len, y, len);
            quadtree(x + len, y + len, len);
            sb.append(')');
        }
    }
}