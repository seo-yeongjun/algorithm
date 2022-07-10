package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/17298
public class S17298_오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> 원본 = new LinkedList<>();
        LinkedList<Integer> stackAnswer = new LinkedList<>();
        LinkedList<Integer> stackNum = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < num; i++) {
            원본.push(Integer.valueOf(st.nextToken()));
        }

        for (int i = 0; i < num; i++) {
            int x = 원본.pop();
            while (!stackNum.isEmpty() && stackNum.peek() <= x) {
                stackNum.pop();
            }
            if (stackNum.isEmpty())
                stackAnswer.push(-1);
            else
                stackAnswer.push(stackNum.peek());
            stackNum.push(x);
        }

        while (!stackAnswer.isEmpty())
            bw.write(stackAnswer.pop() + " ");

        bw.flush();
        bw.close();
    }
}
