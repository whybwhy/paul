package org.paul.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
@Slf4j
public class DataSourceTests {
    @Setter(onMethod_ = {@Autowired})
    private DataSource dataSource;

    @Test
    public void testDataSourceByHikari() {
        try(Connection con = dataSource.getConnection()) {
            log.info(con.toString());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
