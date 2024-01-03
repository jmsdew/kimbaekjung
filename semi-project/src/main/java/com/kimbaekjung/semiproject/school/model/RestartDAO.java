package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.RestartDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RestartDAO {
    int restart(int userCodes);
}
