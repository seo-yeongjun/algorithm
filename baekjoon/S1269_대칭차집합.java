package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1269
public class S1269_대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        int answer = n;
        st = new StringTokenizer(br.readLine() + " " + br.readLine());
        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());
            if (set.contains(s))
                answer -= 2;
            else
                set.add(s);
        }
        System.out.println(answer);
    }
}
