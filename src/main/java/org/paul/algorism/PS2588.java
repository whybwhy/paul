package org.paul.algorism;

import java.util.*;

public class PS2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.next();

        List<Integer> result = new ArrayList();
        char[] charArray = b.toCharArray();
        for (char c : charArray) {
            result.add((c-48) * a);
        }
        Collections.reverse(result);
        for(int r : result) {
            System.out.println(r);
        }

        System.out.println(a*Integer.parseInt(b));
    }
}
