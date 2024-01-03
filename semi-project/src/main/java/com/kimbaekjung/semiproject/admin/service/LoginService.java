package com.kimbaekjung.semiproject.admin.service;

import com.kimbaekjung.semiproject.admin.dao.AdminLoginDAO;
import com.kimbaekjung.semiproject.admin.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private AdminLoginDAO adminLoginDAO;

    public LoginDTO adminLogin(String adminId) {
        LoginDTO selectedAdminPass = adminLoginDAO.adminLogin(adminId);

        return selectedAdminPass;
    }
}
