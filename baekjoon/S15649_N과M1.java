package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15649
public class S15649_N과M1 {
    static boolean[] check;
    static int[] answer;
    static int len;
    static int num;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        len = sc.nextInt();
        check = new boolean[num];
        answer = new int[num];
        dfs(0);
        bw.flush();
    }

    static void dfs(int depth) throws IOException {
        if (depth == len) {
            for (int i = 0; i < len; i++)
                bw.write(answer[i] + " ");
            bw.write("\n");
            return;
        }
        for (int i = 0; i < num; i++) {
            if (!check[i]) {
                check[i] = true;
                answer[depth] = i + 1;
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}