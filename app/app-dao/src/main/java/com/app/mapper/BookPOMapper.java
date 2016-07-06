package com.app.mapper;

import com.app.model.BookPO;
import com.app.model.BookPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookPOMapper {
    int countByExample(BookPOExample example);

    int deleteByExample(BookPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookPO record);

    int insertSelective(BookPO record);

    List<BookPO> selectByExample(BookPOExample example);

    BookPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookPO record, @Param("example") BookPOExample example);

    int updateByExample(@Param("record") BookPO record, @Param("example") BookPOExample example);

    int updateByPrimaryKeySelective(BookPO record);

    int updateByPrimaryKey(BookPO record);
}