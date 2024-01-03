package com.kimbaekjung.semiproject.admin.controller;

import com.kimbaekjung.semiproject.admin.dto.LoginDTO;
import com.kimbaekjung.semiproject.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/adminLoginPage")
    public String adminlogin() {
        return "/admin/admin_login";
    }

    @GetMapping("/adminLogin")
    public String login(){
        return "/admin/admin_home";
    }

    @PostMapping("/adminLogin")
    public ModelAndView login(ModelAndView mv, @RequestParam String adminId, @RequestParam String adminPass) {

        LoginDTO selectedAdmin = loginService.adminLogin(adminId);

        if (selectedAdmin != null && Objects.equals(selectedAdmin.getPass(), adminPass)) {
            mv.setViewName("/admin/admin_home");
        } else {
            mv.addObject("message", "아이디나 비밀번호가 틀렸습니다.");
            mv.setViewName("/admin/admin_login");
        }
        return mv;

    }
}
