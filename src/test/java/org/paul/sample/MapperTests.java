package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class MapperTests {

    @Setter(onMethod_ = @Autowired)
    private SampleMapper sampleMapper;

    @Test

    public void testSample() {
        log.info(sampleMapper.getClass().getName());
        log.info(sampleMapper.getData());
    }

    @Test
    public void testSampleByXml() {
        log.info(sampleMapper.getDataByXml());
    }
}
