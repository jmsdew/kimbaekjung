package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.OneStudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OneStudentDAO {
    List<OneStudentDTO>absent(int studentCode);

    List<OneStudentDTO> late(int studentCode);

    List<OneStudentDTO> leave(int studentCode);

    List<OneStudentDTO> result(int studentCode);
}
