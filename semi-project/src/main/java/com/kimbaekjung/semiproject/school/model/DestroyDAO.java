package com.kimbaekjung.semiproject.school.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DestroyDAO {
    int destroy(int userCodes);
}
