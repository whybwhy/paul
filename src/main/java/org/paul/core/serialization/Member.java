package org.paul.core.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class Member implements Serializable {

    private String name;
    private String email;
    private int age;

    @Override
    public String toString() {
        return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
    }
}
