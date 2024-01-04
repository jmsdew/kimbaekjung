package com.kimbaekjung.semiproject.school.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentNumDAO {
    int studentNum(@Param("studentCode") int studentCode);
}
