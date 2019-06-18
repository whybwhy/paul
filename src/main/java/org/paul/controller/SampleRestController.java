package org.paul.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/rest/*")
@Slf4j
public class SampleRestController {

    @GetMapping(value = "/text", produces = MediaType.TEXT_PLAIN_VALUE + "; charset=UTF-8")
    public String text() {
        return new String("text");
    }
}
