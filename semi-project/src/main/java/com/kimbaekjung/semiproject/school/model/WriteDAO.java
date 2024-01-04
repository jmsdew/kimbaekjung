package com.kimbaekjung.semiproject.school.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WriteDAO {
    int writing(@Param("userCodes") int userCodes, @Param("contentTitle") String contentTitle, @Param("content") String content);
}
