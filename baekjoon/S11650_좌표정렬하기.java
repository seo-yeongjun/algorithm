package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11650
public class S11650_좌표정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        좌표[] xy = new 좌표[sc.nextInt()];
        for (int i = 0; i < xy.length; i++)
            xy[i] = new 좌표(sc.nextInt(), sc.nextInt());
        Arrays.sort(xy, (o1, o2) -> {
            if (o1.x == o2.x)
                return o1.y - o2.y;
            else
                return o1.x - o2.x;
        });
        for(좌표 o : xy){
            System.out.println(o.x+" "+o.y);
        }
    }

    static class 좌표 {
        int x;
        int y;

        public 좌표(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
