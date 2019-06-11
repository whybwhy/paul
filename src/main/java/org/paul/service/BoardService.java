package org.paul.service;

import org.paul.domain.BoardVO;

import java.util.List;

public interface BoardService {

    void register(BoardVO boardVO);
    BoardVO get(Long bno);
    boolean modify(BoardVO board);
    boolean remove(Long bno);
    List<BoardVO> getList();

}
