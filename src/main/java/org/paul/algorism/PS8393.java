package org.paul.algorism;


// 여기서부터 복사

import java.util.Scanner;

/**
 1부터 n까지 합을 출력한다.
 */

public class PS8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        while (a > 0) {
            result = result + a;
            a = a - 1;
        }

        System.out.println(result);
        sc.close();
    }
}