package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.AttendanceDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AttendanceDAO {

    int attendanceStudent(@Param("attendanceDTO") AttendanceDTO attendanceDTO, @Param("userCode") int userCode);
}
