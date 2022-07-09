package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1085
public class S1085_직사각형에서탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(Integer.min(Integer.min(w-x,h-y),Integer.min(x,y)));
    }
}