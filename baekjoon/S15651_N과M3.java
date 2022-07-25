package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15651
public class S15651_N과M3 {
    static int len;
    static int num;
    static int[] answer;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        len = sc.nextInt();
        answer = new int[len];
        solution(0);
        bw.flush();
    }

    static void solution(int depth) throws IOException {
        if (depth == len) {
            for (int i = 0; i < len; i++)
                bw.write(answer[i]+" ");
            bw.write("\n");
            return;
        }
        for (int i = 0; i < num; i++) {
            answer[depth] = i + 1;
            solution(depth + 1);
        }
    }
}