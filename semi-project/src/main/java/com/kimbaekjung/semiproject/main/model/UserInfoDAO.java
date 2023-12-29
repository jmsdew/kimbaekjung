package com.kimbaekjung.semiproject.main.model;


import com.kimbaekjung.semiproject.main.dto.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoDAO {
    int userInfor(@Param("userInfoDTO") UserInfoDTO userInfoDTO, @Param("userCode") int userCode);

    int studentInfo(List<String> names, int userCode);
}
