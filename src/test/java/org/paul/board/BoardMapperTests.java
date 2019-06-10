package org.paul.board;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.domain.BoardVO;
import org.paul.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.paul.config.RootConfig.class})
@Slf4j
public class BoardMapperTests {

    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

    @Test
    public void testGetList() {
        List list = mapper.getList();
        log.info(list.toString());
        //mapper.getList().forEach(board -> log.info(board.toString()));

        List listByXml = mapper.getListByXml();
        log.info(listByXml.toString());
    }

    @Test
    public void testInsert() {
        BoardVO board = new BoardVO();
        board.setTitle("title By Spring MVC Test");
        board.setContent("content By Spring MVC Test");
        board.setWriter("writer By Spring MVC Test");

        mapper.insert(board);

        log.info(mapper.getList().toString());
    }

    @Test
    public void testInsertByKey() {

        BoardVO board = new BoardVO();
        board.setTitle("title By Spring MVC Test");
        board.setContent("content By Spring MVC Test");
        board.setWriter("writer By Spring MVC Test");

        mapper.insertByKey(board);

        log.info(mapper.getList().toString());
    }

    @Test
    public void testRead() {
        BoardVO board = mapper.read(13l);
        log.info(board.toString());
    }

    @Test
    public void testDelete() {
        log.info(Integer.toString(mapper.delete(10l)));
    }
}
