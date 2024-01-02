package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.InsertDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InsertDAO {
    int insert(InsertDTO insertDTO);

}
