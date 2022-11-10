package baekjoon;

import java.util.Scanner;

public class S2156_포도주 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int[] origin = new int[len];
        int connected = 0;
        for (int i = 0; i < len; i++) {
            int num = sc.nextInt();
            origin[i] = num;
            if (i == 0) {
                arr[i] = num;
                connected++;
            } else {
                if (connected == 2) {
                    arr[i] = Math.max(arr[i - 2] + num, arr[i - 1]);
                    arr[i] = Math.max(arr[i], arr[i - 1] - arr[i - 2] + num);
                    if (i >= 3) arr[i] = Math.max(num + origin[i - 1] + arr[i - 3], arr[i]);
                    if (arr[i] == arr[i - 1]) connected = 0;
                    else if (arr[i - 2] + num == arr[i]) {
                        connected = 1;
                    } else {
                        connected = 2;
                    }
                } else {
                    arr[i] = arr[i - 1] + num;
                    connected++;
                }
            }
        }
        System.out.println(arr[len - 1]);
    }
}
