package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration(classes = {RootConfig.class})
public class TransactionTests {

    @Setter(onMethod_ = {@Autowired})
    private TransactionService service;

    @Test
    public void traction1() {
        String str = "org.springframework.test.context.ContextConfiguration;\n" +
                "import org.springframework.test.context.junit4.SpringJUnit4ClassRunner";

        log.info(Integer.toString(str.getBytes().length));
        service.add(str);
    }
}
