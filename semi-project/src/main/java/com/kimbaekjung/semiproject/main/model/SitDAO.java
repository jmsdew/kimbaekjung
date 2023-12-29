package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.SitDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SitDAO {

    int sitDown(@Param("sitDTO") SitDTO sitDTO, @Param("userCode") int userCode);

    int standUp(@Param("sitDTO") SitDTO sitDTO, @Param("userCode") int userCode);
}
