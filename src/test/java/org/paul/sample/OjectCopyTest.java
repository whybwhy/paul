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
    public void shallowCopyByString1() {
        String master = "origin";
        String feather = master;

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));
    }

    @Test
    public void shallowCopyByString2() {
        String master = "origin";
        String feather = master;

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));

        master = "updated";

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));
    }


    @Test
    public void shallowCopyByList1() {

        List<Object> master = new ArrayList();
        master.add("1");
        master.add(new Member());

        List<Object> feather = master;

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));

    }

    @Test
    public void shallowCopyByList2() {

        List<Object> master = new ArrayList();
        master.add("1");
        master.add(new Member());


        List<Object> feather = master;

        master.add("master");
        feather.add("feather");

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));

        System.out.println(master);
        System.out.println(feather);
    }

    @Test
    public void deepCopyByList1() {

        ArrayList<Member> master = new ArrayList();   // clone 사용을 위해 ArrayList로 선언
        master.add(member);

        ArrayList<Member> feather = (ArrayList<Member>) master.clone(); // Deep Copy 1
        /*ArrayList<Member> feather = new ArrayList();    // Deep Copy 2
        feather.addAll(master);*/

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));

    }

    @Test
    public void deepCopyByList2() {

        ArrayList<Member> master = new ArrayList();   // clone 사용을 위해 ArrayList로 선언
        master.add(member);

        ArrayList<Member> feather = (ArrayList<Member>) master.clone(); // Deep Copy 1

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));

        master.add(new Member());
        feather.add(new Member());

        System.out.println("reference = " + (master == feather));
        System.out.println("hashcode() = " + (master.hashCode() == feather.hashCode()) + ", equals() = " + master.equals(feather));

    }
}
