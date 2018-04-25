package com.chenbuer.test.dao.mapper;

import com.chenbuer.test.dao.model.TStudents;
import com.chenbuer.test.dao.model.TStudentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStudentsMapper {
    long countByExample(TStudentsExample example);

    int deleteByExample(TStudentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStudents record);

    int insertSelective(TStudents record);

    List<TStudents> selectByExample(TStudentsExample example);

    TStudents selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStudents record, @Param("example") TStudentsExample example);

    int updateByExample(@Param("record") TStudents record, @Param("example") TStudentsExample example);

    int updateByPrimaryKeySelective(TStudents record);

    int updateByPrimaryKey(TStudents record);
}