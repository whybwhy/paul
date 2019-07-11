package org.paul.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SampleRestDTO {

    private int seq;
    private String id;
    private boolean isLoggedIn;
}
