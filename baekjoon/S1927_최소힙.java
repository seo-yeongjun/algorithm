package baekjoon;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

//https://www.acmicpc.net/problem/1927
public class S1927_최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new PriorityQueue<>();

        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) queue.add(x);
            if (!queue.isEmpty() && x == 0) bw.write(queue.poll() + "\n");
            else if (queue.isEmpty()) bw.write(0 + "\n");
        }
        bw.flush();
    }
}
