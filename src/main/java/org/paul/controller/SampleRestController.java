package org.paul.controller;

import lombok.extern.slf4j.Slf4j;
import org.paul.domain.SampleRestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/sample/rest/*")
@Slf4j
public class SampleRestController {

    @GetMapping(value = "/text", produces = MediaType.TEXT_PLAIN_VALUE + "; charset=UTF-8")
    public String text() {
        return new String("text");
    }

    //@GetMapping(value="/object", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
    @GetMapping(value="/object")
    public SampleRestDTO json() {
        log.info("----------");
        return new SampleRestDTO(1, "whybwhy", Boolean.TRUE);
    }

    @GetMapping(value="/list")
    public List<SampleRestDTO> list() {
        return IntStream.range(1, 10).mapToObj(i->new SampleRestDTO(i, i+ "First", Boolean.TRUE)).collect(Collectors.toList());
    }

    @GetMapping(value="/map")
    public Map<Integer, SampleRestDTO> map() {

        Map<Integer, SampleRestDTO> result = new HashMap<>();
        result.put(0, new SampleRestDTO(1, "test", false));
        return result;
    }

    @GetMapping(value = "/check", params = {"height", "weight"})
    public ResponseEntity<SampleRestDTO> check(Double height, Double weight) {

        SampleRestDTO vo = new SampleRestDTO(1, "test", false);
        ResponseEntity<SampleRestDTO> result;

        if (height < 100) {
            result = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(vo);
        } else {
            result = ResponseEntity.status(HttpStatus.OK).body(vo);
        }

        return result;
    }

    @GetMapping("/product/{cat}/{pid}")
    public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") Integer pid){
        return new String[] {"category : " + cat, "pid : " + pid};
    }

    @PostMapping("/convert")
    public SampleRestDTO convert(@RequestBody SampleRestDTO dto) {
        return dto;
    }


}
