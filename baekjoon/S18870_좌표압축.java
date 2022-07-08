package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/18870
public class S18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] 원본;
        int[] 정렬 = new int[num];

        for (int i = 0; i < num; i++)
            정렬[i] = Integer.parseInt(st.nextToken());

        원본 = 정렬.clone();
        Arrays.sort(정렬);

        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int v : 정렬) {
            if (!map.containsKey(v))
                map.put(v, idx++);
        }

        for (int i = 0; i < num; i++)
            bw.write(map.get(원본[i]) + " ");
        bw.flush();
    }
}
