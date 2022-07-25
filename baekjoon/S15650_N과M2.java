package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class S15650_N과M2 {
    static int num;
    static int len;
    static int[] answer;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        len = sc.nextInt();
        answer = new int[len];
        solution(0, 0);
        bw.flush();
    }

    static void solution(int depth, int idx) throws IOException {
        if (depth == len) {
            for(int i = 0; i<len;i++)
                bw.write(answer[i]+" ");
            bw.write("\n");
            return;
        }
        for (int i = idx; i < num; i++) {
            answer[depth] = i+1;
            solution(depth + 1, i+1);
        }
    }
}