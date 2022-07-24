package baekjoon;

import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/1655
public class S1655_가운데를말해요 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(br.readLine());
            maxQueue.add(x);
            if (maxQueue.size() == minQueue.size() + 2) {
                minQueue.add(maxQueue.poll());
            }
            while (!minQueue.isEmpty() && !maxQueue.isEmpty() && maxQueue.peek() > minQueue.peek()) {
                maxQueue.add(minQueue.poll());
                minQueue.add(maxQueue.poll());
            }
            bw.write(maxQueue.peek()+"\n");
        }
        bw.flush();
    }
}