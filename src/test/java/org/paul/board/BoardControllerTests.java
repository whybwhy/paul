package org.paul.board;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {org.paul.config.RootConfig.class, org.paul.config.ServletConfig.class})
@Slf4j
public class BoardControllerTests {

    @Setter(onMethod_ = {@Autowired})
    private WebApplicationContext context;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testList() throws Exception {
        log.info(
                mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/board/list"))
                        .andReturn()
                        .getModelAndView()
                        .getModelMap()
                        .toString()
        );
    }

    @Test
    public void testGet() throws Exception {
        log.info(
                mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/board/get")
                                .param("bno", "1"))
                        .andReturn()
                        .getModelAndView()
                        .getModelMap()
                        .toString()
        );
    }

    @Test
    public void testRegister() throws Exception {
        log.info(
                mockMvc.perform(
                        MockMvcRequestBuilders
                                .post("/board/register")
                                .param("title", "title by Junit Controller")
                                .param("content","content by Junit Controller")
                                .param("writer","Writer by Junit controller"))
                        .andReturn()
                        .getModelAndView()
                        .getModelMap()
                        .toString()
        );
    }

    @Test
    public void testModify() throws Exception {

        log.info(
                mockMvc.perform(
                    MockMvcRequestBuilders
                        .post("/board/modify")
                        .param("bno", "1")
                        .param("title","title by Junit Controller")
                        .param("content","title by Junit Controller"))
                    .andReturn()
                    .getModelAndView()
                    .getModelMap()
                    .toString()
        );
    }

    @Test
    public void testRemove() throws Exception {
        log.info(
            mockMvc.perform(
                    MockMvcRequestBuilders
                    .get("/board/remove")
                    .param("bno","1"))
                .andReturn()
                .getModelAndView()
                .getModelMap()
                .toString()
        );
    }
}
