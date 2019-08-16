package org.paul.pmd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListGCTest {

        public static void main(String[] args)throws Exception {
            List<Integer> li = IntStream.range(1, 100).boxed().collect(Collectors.toList());
            for (int i=1; true; i++) {
                if (i % 50 == 0) {
                    //li = new ArrayList<Integer>();  // 새로운 List 를 li 변수에 할당한다.
                    Thread.sleep(200);
                }
                //System.out.println("test");
                IntStream.range(0, 100).forEach(li::add);
            }
        }
    }

