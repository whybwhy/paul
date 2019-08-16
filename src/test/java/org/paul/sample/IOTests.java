package org.paul.sample;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.core.io.FileIOGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Slf4j
public class IOTests {

    @Setter(onMethod_ = @Autowired)
    FileIOGenerator fileIOGenerator;

    @Test
    public void fileIOTest() {
        String iPath = "src/test/java/org/paul/sample/source.txt";
        String oPath = "src/test/java/org/paul/sample/result.txt";
        fileIOGenerator.ioByTryCatchResource(iPath, oPath);
    }

    @Test
    public void fileIOTestByAppend() {
        String iPath = "src/test/java/org/paul/sample/source.txt";
        String oPath = "src/test/java/org/paul/sample/result.txt";
        fileIOGenerator.ioByTryCatchResource(iPath, oPath, Boolean.TRUE);
    }
}
