package com.kimbaekjung.semiproject.management.model;

import com.kimbaekjung.semiproject.management.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageDAO {
    List<manageDTO> picks(int userCode);

    List<AttendDTO> absent(int pickStudentCode);

    List<AttendDTO> late(int pickStudentCode);

    List<AttendDTO> leave(int pickStudentCode);

    List<AttendDTO> result(int pickStudentCode);

    List<PraiseDTO> praise(int pickStudentCode);

    List<RecommendDTO> recommend(int selectedOption);

    List<AttendDetailDTO> attendDetail(int pickStudentCode);
}
