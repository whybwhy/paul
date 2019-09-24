package org.paul.algorism;

import java.util.Scanner;

public class PS1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] array = input.split(" ");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }

        sc.close();
    }
}