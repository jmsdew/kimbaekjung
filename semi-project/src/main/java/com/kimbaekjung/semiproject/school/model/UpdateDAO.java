package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.UpdateDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpdateDAO {
    int update(UpdateDTO updateDTO);
}
