package org.paul.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface Sample2Mapper {

    @Select("SELECT content FROM practice.table_board LIMIT 1")
    public String getData();

    public String getDataByXml();


    @Insert("insert into tbl_transaction500 (col500) values (#{data})")
    public int insertCol500(String data);

    @Insert("insert into tbl_transaction50 (col50) values (#{data})")
    public int insertCol50(String data);



}
