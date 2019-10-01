package org.paul.algorism;

/**
 https://www.acmicpc.net/problem/11022
 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

// 여기서부터 복사

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        List<Integer> list = new ArrayList();
        List<Integer> listA = new ArrayList();
        List<Integer> listB = new ArrayList();
        while (input > 0) {

            String[] line = sc.nextLine().split(" ");
            int a  = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            list.add(a+b);
            listA.add(a);
            listB.add(b);
            input = input -1;
        }
        int count = 1;
        for(int a : list) {
            System.out.println("Case #" + count + ": " + listA.get(count-1) + " + " +listB.get(count-1) + " = " + a);
            count ++;
        }

        sc.close();
    }
}