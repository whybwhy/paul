package org.paul.mapper;

import org.apache.ibatis.annotations.Select;

public interface SampleMapper {

    @Select("SELECT content FROM practice.table_board LIMIT 1")
    public String getData();

    public String getDataByXml();
}
