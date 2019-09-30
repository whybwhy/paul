package org.paul.algorism;

/**
 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
// 여기서부터 복사

import java.util.Scanner;

public class PS2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input>0) {
            System.out.println(input);
            input = input - 1;
        }
        sc.close();
    }
}