package org.paul.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.paul.domain.BoardVO;
import org.paul.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {


    private BoardMapper mapper;

    @Override
    public void register(BoardVO board) {
        mapper.insertByKey(board);
    }

    @Override
    public BoardVO get(Long bno) {
        return mapper.read(bno);
    }

    @Override
    public boolean modify(BoardVO board) {
        return mapper.update(board) == 1;
    }

    @Override
    public boolean remove(Long bno) {
        return mapper.delete(bno) == 1;
    }

    @Override
    public List<BoardVO> getList() {
        return mapper.getListByXml();
    }
}
