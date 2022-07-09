package baekjoon;

import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2477
public class S2477_참외밭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Integer[] arr = new Integer[6];
        int 가로max = 0;
        int 세로max = 0;
        int 작가;
        int 작세;

        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            int l = sc.nextInt();
            if (a == 1 || a == 2) {
                if (l > 가로max)
                    가로max = l;
            } else {
                if (l > 세로max)
                    세로max = l;
            }
            arr[i] = l;
        }

        int idx가 = List.of(arr).indexOf(가로max);
        int idx세 = List.of(arr).indexOf(세로max);

        if (idx가 == 0)
            작가 = arr[1] - arr[5];
        else if (idx가 == 5)
            작가 = arr[4] - arr[0];
        else
            작가 = arr[idx가 - 1] - arr[idx가 + 1];

        if (idx세 == 0)
            작세 = arr[1] - arr[5];
        else if (idx세 == 5)
            작세 =arr[4] - arr[0];
        else
            작세 = arr[idx세 - 1] - arr[idx세 + 1];

        System.out.println(num * ((가로max * 세로max) - Math.abs(작세 * 작가)));
    }
}
