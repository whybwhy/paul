package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.service.AOPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration(classes = {RootConfig.class})
public class AOPTests {

    @Setter(onMethod_ = @Autowired)
    private AOPService service;

    @Test
    public void testClass() {
        log.info(service.toString());
        log.info(service.getClass().getName());
    }

    @Test
    public void testBefore() throws Exception {
        service.add("1", "2");
    }

    @Test
    public void testAfterThrowing() throws Exception {
        service.add("1", "text");
    }



}
