package com.kimbaekjung.semiproject.rank.totalRank.model;


import com.kimbaekjung.semiproject.rank.totalRank.dto.GradeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeDAO {


    List<GradeDTO> gradeReason(GradeDTO gradeDTO);
}
