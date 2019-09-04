package org.paul.sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class CollectionTests {

    List<Object> list = new ArrayList();
    Set<Object> set = new HashSet();
    Map<Integer, Object> map = new HashMap();

    @Before
    public void init() {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");

        map.put(1, "11");
        map.put(2, "22");
        map.put(3, "33");
        map.put(4, "44");
        map.put(5, "55");
        map.put(6, "66");

    }
    @Test
    public void iterator4List() {
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void enhanced4List() {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    @Test
    public void iterator4Set() {
        Iterator<Object> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void enhanced4Set() {
        for (Object obj : set) {
            System.out.println(obj);
        }
    }

    @Test
    public void loop4Map() {

        Iterator keySet = map.keySet().iterator();
        while(keySet.hasNext()) {
            System.out.println(keySet.next());
        }
        for (Integer i : map.keySet()) {
            System.out.println(i);
        }

        Iterator values = map.values().iterator();
        while(values.hasNext()) {
            System.out.println(values.next());
        }
        for (Object obj : map.values()) {
            System.out.println(obj);
        }

        Iterator entryIterator = map.entrySet().iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<Integer, Object> entry = (Map.Entry<Integer, Object>) entryIterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        for (Map.Entry<Integer, Object> e : map.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
