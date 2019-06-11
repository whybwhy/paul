package org.paul.board;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.paul.config.RootConfig;
import org.paul.domain.BoardVO;
import org.paul.mapper.BoardMapper;
import org.paul.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.paul.config.RootConfig.class})
@Slf4j
public class BoardServiceTests {

    @Setter(onMethod_ = {@Autowired})
    private BoardService service;

    @Test
    public void testExist() {
        log.info(service.toString());
        assertNotNull(service);
    }

    @Test
    public void testRegister() {
        BoardVO board = new BoardVO();
        board.setTitle("title By Spring MVC Test");
        board.setContent("content By Spring MVC Test");
        board.setWriter("writer By Spring MVC Test");
        service.register(board);

        log.info(board.toString());
    }

    @Test
    public void testGet() {
        log.info(service.get(15l).toString());
    }

    @Test
    public void testGetList() {
        List list = service.getList();
        log.info(list.get(0).toString());
    }

    @Test
    public void testUpdate() {
        BoardVO board = new BoardVO();
        board.setTitle("title");
        board.setContent("content");
        board.setBno(1l);
        service.modify(board);
    }

    @Test
    public void testRemove() {
        boolean result = service.remove(11l);
        log.info(String.valueOf(result));
    }
}
