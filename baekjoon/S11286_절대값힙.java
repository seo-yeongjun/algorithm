package baekjoon;

import java.io.*;
import java.util.PriorityQueue;

//https://www.acmicpc.net/problem/11286
public class S11286_절대값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<절대값값> queue = new PriorityQueue<>();

        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) queue.add(new 절대값값(Math.abs(x), x));
            if (!queue.isEmpty() && x == 0) bw.write(queue.poll().값 + "\n");
            else if (queue.isEmpty()) bw.write(0 + "\n");
        }
        bw.flush();
    }
}

class 절대값값 implements Comparable<절대값값> {
    int 절대값;
    int 값;

    절대값값(int 절대값, int 값) {
        this.값 = 값;
        this.절대값 = 절대값;
    }

    @Override
    public int compareTo(절대값값 o) {
        if (this.절대값 == o.절대값) return this.값 - o.값;
        else return this.절대값 - o.절대값;
    }
}