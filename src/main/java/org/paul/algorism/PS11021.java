package org.paul.algorism;

/**
 https://www.acmicpc.net/problem/11021
 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */

// 여기서부터 복사

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        List<Integer> list = new ArrayList();

        while (input > 0) {

            String[] line = sc.nextLine().split(" ");
            int a  = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            list.add(a+b);
            input = input -1;
        }
        int count = 1;
        for(int a : list) {
            System.out.println("Case #" + count + ": " + a);
            count ++;
        }

        sc.close();
    }
}