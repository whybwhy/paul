package org.paul.pmd;

import java.util.ArrayList;
import java.util.List;

public class LoopExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list instanceof List);
        System.out.println(list instanceof ArrayList);

    }
}
