package org.paul.sample;

import com.google.gson.Gson;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.config.ServletConfig;
import org.paul.domain.SampleRestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes={RootConfig.class, ServletConfig.class})
@Slf4j
public class RestAPITests {

    @Setter(onMethod_ = {@Autowired})
    private WebApplicationContext context;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void convert() throws Exception {
        SampleRestDTO dto = new SampleRestDTO(1, "test", true);
        String jsonString = new Gson().toJson(dto);

        log.info(jsonString);

        mockMvc.perform(post("/sample/rest/convert")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString))
                .andExpect(status().is(200));
    }


}
