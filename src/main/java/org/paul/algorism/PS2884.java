package org.paul.algorism;

import java.util.Scanner;

/**
 알람을 45분 앞서는 시간으로 바꾸는 것이다.
 */

public class PS2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int output_hh = a;
        int output_mm = b - 45;

        if (b - 45 < 0) {
            output_mm = output_mm + 60;
            output_hh = a - 1;
        }

        if (output_hh < 0) {
            output_hh = 23;
        }

        System.out.println(output_hh + " " + output_mm);
        sc.close();
    }
}