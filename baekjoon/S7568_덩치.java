package baekjoon;
//https://www.acmicpc.net/problem/7568

import java.util.Arrays;
import java.util.Scanner;

public class S7568_덩치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        등치[] 등치s = new 등치[num];
        String answer = "";
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            등치s[i] = new 등치(x, y);
        }
        for (등치 등치 : 등치s) {
            int count = (int) Arrays.stream(등치s).filter(i -> i.x > 등치.x && i.y > 등치.y).count();
            answer += count + 1+" ";
        }
        System.out.print(answer.substring(0,answer.length()-1));
    }
}

class 등치 {
    int x;
    int y;
    int rank;

    등치(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
