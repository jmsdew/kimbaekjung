package com.kimbaekjung.semiproject.management.model;

import com.kimbaekjung.semiproject.management.dto.manageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageDAO {
    List<manageDTO> picks();
}
