package org.paul.algorism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

public class PS10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList();

        while (input > 0) {
            list.add(sc.nextLine());
            input = input - 1;
        }

        for (String line : list) {
            String[] stream = line.split(" ");
            int a = Integer.parseInt(stream[0]);
            int b = Integer.parseInt(stream[1]);
            System.out.println(a+b);
        }
        sc.close();
    }
}