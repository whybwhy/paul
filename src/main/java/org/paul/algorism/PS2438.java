package org.paul.algorism;

/**
 https://www.acmicpc.net/problem/2438
 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */

// 여기서부터 복사
import java.util.Scanner;

public class PS2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.next());
        StringBuilder builder = new StringBuilder("");

        while(input > 0) {
            builder.append("*");
            input--;
            System.out.println(builder);
        }
        sc.close();
    }
}