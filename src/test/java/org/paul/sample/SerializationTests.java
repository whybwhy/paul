package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.core.serialization.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
public class SerializationTests {

    @Setter(onMethod_ = {@Autowired})
    private Member member;

    @Test
    public void serialization() {
        member.setAge(16);
        member.setEmail("whybwhy@gmail.com");
        member.setName("yun");
        log.info(member.toString());

        byte[] serializedMember;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                serializedMember = baos.toByteArray();

                log.info(Base64.getEncoder().encodeToString(serializedMember));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void deserialization() {
        String base64Member = "rO0ABXNyACJvcmcucGF1bC5jb3JlLnNlcmlhbGl6YXRpb24uTWVtYmVy7IVnHeb0vxICAANJAANhZ2VMAAVlbWFpbHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wABG5hbWVxAH4AAXhwAAAAEHQAEXdoeWJ3aHlAZ21haWwuY29tdAADeXVu";
        byte[] deserializedMember = Base64.getDecoder().decode(base64Member);

        try (ByteArrayInputStream bais = new ByteArrayInputStream(deserializedMember)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                Object obj = ois.readObject();
                Member member = (Member) obj;
                log.info(member.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
