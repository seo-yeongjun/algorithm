package baekjoon;

import java.util.Scanner;

public class S10844_쉬운계단수 {
    public static void main(String[] args) {
        int division = 1000000000;
        long[][] arr = new long[101][10];
        for (int i = 0; i < 10; i++) {
            arr[1][i] = 1;
        }
        for (int j = 2; j < 101; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0) arr[j][i] = arr[j - 1][i + 1] %division;
                else if (i == 9) arr[j][i] = arr[j - 1][i - 1] % division;
                else arr[j][i] = arr[j - 1][i - 1] % division + arr[j - 1][i + 1] % division;
            }
        } Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += arr[len][i] % division;
            sum %= division;
        }
        System.out.println(sum % division);
    }
}
