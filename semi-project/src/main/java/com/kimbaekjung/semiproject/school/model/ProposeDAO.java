package com.kimbaekjung.semiproject.school.model;


import com.kimbaekjung.semiproject.school.dto.ProposeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProposeDAO {


    List<ProposeDTO> propose();
}
