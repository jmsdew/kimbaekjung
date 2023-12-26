package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.SearchPropDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PropSearchDAO {
    List<SearchPropDTO> searchProp(String keyword);
}
