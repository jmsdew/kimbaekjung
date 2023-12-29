package com.kimbaekjung.semiproject.school.model;


import com.kimbaekjung.semiproject.school.dto.SchoolDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolDAO {
    List<SchoolDTO> oneName(int userCodes);


}