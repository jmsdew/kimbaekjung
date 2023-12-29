package com.kimbaekjung.semiproject.school.model;


import com.kimbaekjung.semiproject.school.dto.AttendNumDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttendNumDAO {

//    List<AttendNumDTO> attendNum();

    List<AttendNumDTO> getStudentDetail(int studentCode);


}
