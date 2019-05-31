package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
public class SampleTests {
    @Setter(onMethod_ = {@Autowired})
    private Restaurant restaurant;

    @Setter(onMethod_ = {@Autowired})
    private Hotel hotel;

    @Test
    public void testComponent() {
        assertNotNull(restaurant);

        log.info(restaurant.toString());
        log.info("---------------------");
        log.info(restaurant.getChef().toString());

        assertNotNull(hotel);
        log.info(hotel.toString());
        log.info("---------------------");
        log.info(hotel.getChef().toString());

    }
}
