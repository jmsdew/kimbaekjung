package com.kimbaekjung.semiproject.admin.controller;

import com.kimbaekjung.semiproject.admin.dto.UserSelectDTO;
import com.kimbaekjung.semiproject.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/userManagement")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public ModelAndView selectAllUser(ModelAndView mv) {
        List<UserSelectDTO> userList = userService.selectAllUser();

        if (Objects.isNull(userList)) {
            System.out.println("등록된 유저가 없습니다.");
        }
        mv.addObject("userList", userList);
        mv.setViewName("/admin/admin_userManagement");
        return mv;
    }
}
