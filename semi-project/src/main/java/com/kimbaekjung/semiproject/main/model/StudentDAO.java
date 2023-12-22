package com.kimbaekjung.semiproject.main.model;

import com.kimbaekjung.semiproject.main.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDAO {

    List<StudentDTO> studentName();

    List<StudentDTO> allStudent();
}
