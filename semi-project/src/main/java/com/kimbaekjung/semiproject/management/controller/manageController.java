package com.kimbaekjung.semiproject.management.controller;

import com.kimbaekjung.semiproject.management.dto.manageDTO;
import com.kimbaekjung.semiproject.management.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/management/*")
public class manageController {
    @Autowired
    private ManageService manageService;


    @GetMapping("student_manage")
    public ModelAndView pickName(ModelAndView mv){
        List<manageDTO> picks = manageService.pickName();
        mv.addObject("picks",picks);
        mv.setViewName("/management/student_manage");

        return mv;
    }


}
