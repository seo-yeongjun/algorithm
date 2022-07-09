package baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10816
public class S10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> 보유 = new HashMap<>();
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<num; i++){
            int key = Integer.parseInt(st.nextToken());
            if(보유.containsKey(key))
                보유.put(key,보유.get(key)+1);
            else
                보유.put(key,1);
        }
        num = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i =0; i<num; i++){
            bw.write(보유.getOrDefault(Integer.parseInt(st.nextToken()),0)+" ");
        }
        bw.flush();
        bw.close();
    }
}
