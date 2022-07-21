package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1107
public class S1107_리모컨 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        int goal = sc.nextInt();
        int exceptNum = sc.nextInt();
        int answer = Math.abs(goal - 100);
        int minus = goal;
        int plus = goal;
        ArrayList<Integer> ExceptList = new ArrayList<>();
        for (int i = 0; i < exceptNum; i++) {
            ExceptList.add(sc.nextInt());
        }
        if (ExceptList.size() == 10) {
            System.out.print(answer);
        } else {
            while (true) {
                if (minus == 0 && ExceptList.contains(0)) {
                    minus = 100;
                    break;
                } else if (minus == 0) break;
                int tmp = minus;
                boolean pass = true;
                while (tmp > 0) {
                    if (ExceptList.contains(tmp % 10)) {
                        pass = false;
                        break;
                    }
                    tmp /= 10;
                }
                if (pass) break;
                else minus--;
            }
            len = String.valueOf(minus).length();
            answer = Math.min(answer, len + Math.abs(goal - minus));
            while (true) {
                if (answer < len + Math.abs(plus - goal)) {
                    break;
                }
                int tmp = plus;
                boolean pass = true;
                do {
                    if (ExceptList.contains(tmp % 10)) {
                        pass = false;
                        break;
                    }
                    tmp /= 10;
                } while (tmp > 0);

                if (pass) break;
                else plus++;
            }
            len = String.valueOf(plus).length();
            answer = Math.min(answer, len + Math.abs(plus - goal));
            System.out.print(answer);
        }
    }
}