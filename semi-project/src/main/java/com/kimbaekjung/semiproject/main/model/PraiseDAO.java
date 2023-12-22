package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.PraiseDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PraiseDAO {

    int processPraise(PraiseDTO praiseDTO);
}
