package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.AttendanceDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttendanceDAO {

    int attendanceStudent(AttendanceDTO attendanceDTO);
}
