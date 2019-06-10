package org.paul.mapper;

import org.apache.ibatis.annotations.Select;
import org.paul.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    @Select("select bno, title, content, writer, regDate, updateDate from tbl_board where bno > 0")
    List<BoardVO> getList();

    List<BoardVO> getListByXml();

    void insert(BoardVO board);

    void insertByKey(BoardVO board);

    BoardVO read(Long bno);

    int delete(long bno);
    //  인터페이스에서는 선언하는 메소드들은 기본적으로 public
    //  Modifier 'public' is redundant for interface methods
    //  public List<BoardVO> getList();






}
