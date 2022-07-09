package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

//https://www.acmicpc.net/problem/3009
public class S3009_네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> x = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            if (i % 2 == 0) {
                if (x.contains(num))
                    x.remove(num);
                else x.add(num);
            }
            else{
                if(y.contains(num))
                    y.remove(num);
                else y.add(num);
            }
        }
        x.forEach(System.out::print);
        System.out.print(" ");
        y.forEach(System.out::print);
    }
}
