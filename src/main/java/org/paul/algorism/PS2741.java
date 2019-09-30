package org.paul.algorism;


// 여기서부터 복사

import java.util.Scanner;

/**
 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */

public class PS2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        while (count <= input) {
            System.out.println(count);
            count = count +1;
        }
        sc.close();
    }
}