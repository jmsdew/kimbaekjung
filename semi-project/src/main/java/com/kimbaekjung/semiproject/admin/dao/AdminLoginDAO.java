package com.kimbaekjung.semiproject.admin.dao;

import com.kimbaekjung.semiproject.admin.dto.LoginDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminLoginDAO {

    LoginDTO adminLogin(String adminId);
}
