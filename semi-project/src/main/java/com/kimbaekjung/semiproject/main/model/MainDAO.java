package com.kimbaekjung.semiproject.main.model;

import com.kimbaekjung.semiproject.main.dto.MainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainDAO {
    List<MainDTO> userSchool();
}
