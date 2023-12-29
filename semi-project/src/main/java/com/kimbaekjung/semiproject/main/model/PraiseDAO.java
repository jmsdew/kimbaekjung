package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.PraiseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PraiseDAO {

    int processPraise(@Param("praiseDTO") PraiseDTO praiseDTO,@Param("userCode") int userCode);
}
