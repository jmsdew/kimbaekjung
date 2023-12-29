package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.InsertDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertDAO {
    int insert(InsertDTO insertDTO);

}
