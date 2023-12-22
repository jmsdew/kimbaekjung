package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.SitDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SitDAO {

    int sitDown(SitDTO sitDTO);
}
