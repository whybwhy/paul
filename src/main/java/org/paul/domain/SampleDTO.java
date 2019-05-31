package org.paul.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SampleDTO {
    private String name;
    private int age;
    private Date date;

    // @InitBinder 와 동시에 사용할 수 없다. 400
    // @ResponseBody 와 동시에 사용할 수 없다.
    // @DateTimeFormat(pattern = "yyyyMMdd")
    private Date dueDate;
}
