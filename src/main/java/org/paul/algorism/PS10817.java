package org.paul.algorism;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 */

public class PS10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        List<Integer> list = new ArrayList();

        list.add(Integer.parseInt(input[0]));
        list.add(Integer.parseInt(input[1]));
        list.add(Integer.parseInt(input[2]));

        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(1));
        sc.close();
    }
}