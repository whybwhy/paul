package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.core.serialization.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
public class OjectCopyTest {

    @Setter(onMethod_ = @Autowired)
    Member member;

    @Before
    public void init() {
        member.setAge(30);
        member.setEmail("whybwhy@gmail.com");
        member.setName("name");
    }

    @Test
    public void copyByShallow() {

        // TODO Shallow Copy : String
        String master = "origin";
        String feather = master;

        System.out.println(master == feather);
        System.out.println(master.hashCode() + " : " + feather.hashCode());
        System.out.println(master.equals(feather));

        // TODO Shallow Copy : List
        List<Object> orgine = new ArrayList();

        orgine.add("1");
        orgine.add(new Member());
        orgine.add(4);
        List<Object> copied = orgine;


        System.out.println(orgine == copied);
        System.out.println(orgine.hashCode() + " : " + copied.hashCode());
    }

    @Test
    public void copyByDeep() {

        ArrayList<Member> master = new ArrayList();   // clone 사용을 위해 ArrayList로 선언
        master.add(member);

        ArrayList<Member> feather = (ArrayList<Member>) master.clone(); // Deep Copy 1
        /*ArrayList<Member> feather = new ArrayList();    // Deep Copy 2
        feather.addAll(master);*/

        System.out.println(master == feather);
        // equals 와 hashcode 상호보완
        System.out.println(master.hashCode() + " : " + feather.hashCode());
        System.out.println(master.equals(feather));

        member.setAge(30);
        member.setEmail("whybwhy@gmail.com");
        member.setName("copied");

        System.out.println(master);
        System.out.println(feather);

    }
}
