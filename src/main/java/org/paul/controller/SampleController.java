package org.paul.controller;

import lombok.extern.slf4j.Slf4j;
import org.paul.domain.SampleDTO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.WebBindingInitializer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Slf4j
@Controller
@RequestMapping("/sample/*")
public class SampleController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/get")
    public String testGet() {
        log.info("GET Only");
        return null;
    }

    @GetMapping("/domain")
    public String testData(SampleDTO dto) {
        log.info(dto.toString());
        return "/sample/index";
    }

    @RequestMapping("/parameter")
    public String testParameter(@RequestParam("name") String name, @RequestParam int age) {
        log.info(name);
        log.info(Integer.toString(age));
        return null;
    }

    @RequestMapping("/list")
    public String testArrayList(@RequestParam("names") ArrayList<String> names) {
        log.info(names.toString());
        return null;
    }

    @RequestMapping("/array")
    public String testArray(@RequestParam("names") String[] names) {
        log.info(names.toString());
        return null;
    }

    @RequestMapping("/model")
    public String testModel(Model model) {
        model.addAttribute("date", new java.util.Date());
        return null;
    }

    @RequestMapping("/mixed")
    public String testMixed(SampleDTO dto, @RequestParam("data") String data, @ModelAttribute("page") int page, Model model) {
        model.addAttribute("etc", "etc");
        return "/sample/index";
    }

    // Return Type
    // - void : 요청된 URL과 동일한 JSP 파일명
    // - String : JSP 파일명
    // - DTO : JSON by @ResponseBody
    // - ResponseEntity : Http Header 정보과 내용을 정의
    // - Model, ModelAndView
    // - HttpHeaders : Http Header 메세지만 전달할 용도
    @RequestMapping("/return/void")
    public void testVoid() {

    }

    @RequestMapping("/return/string")
    public String testString() {
        return "sample/return/string";
    }

    @RequestMapping("/return/json")
    public @ResponseBody SampleDTO testJson() {
        SampleDTO dto = new SampleDTO();
        dto.setAge(20);
        dto.setName("whybwhy");
        return dto;
    }


}
