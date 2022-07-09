package baekjoon;


import java.util.HashSet;
import java.util.Scanner;


//https://www.acmicpc.net/problem/11478
public class S11478_서로다른부분문자열의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length() + 1; i++) {
            for (int j = 1; j < str.length() + 1; j++) {
                if (i < j)
                    set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
