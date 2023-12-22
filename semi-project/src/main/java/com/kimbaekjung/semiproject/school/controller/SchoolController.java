package com.kimbaekjung.semiproject.school.controller;


import com.kimbaekjung.semiproject.school.dto.NotificationDTO;
import com.kimbaekjung.semiproject.school.dto.SchoolDTO;
import com.kimbaekjung.semiproject.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/school/*")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping("mypage_info")
    public ModelAndView namesBtn(ModelAndView mv){
        List<SchoolDTO> names = schoolService.oneName();
//        SchoolDTO names = schoolService.oneName(schoolDTO);
        mv.addObject("names",names);
        mv.setViewName("/school/mypage_info");

        return mv;
    }


    @GetMapping("call_info_notification")
    public ModelAndView notifi(ModelAndView mv){
        List<NotificationDTO> titles = schoolService.titles();
        System.out.println("dfw");
        mv.addObject("titles",titles);
        mv.setViewName("/school/call_info_notification");

        return mv;
    }


    @GetMapping("restart_info")
    public String restart(){
        return "/school/restart_info";
    }

    @GetMapping("logout_info")
    public String logout(){
        return "/school/logout_info";
    }

    @GetMapping("destroy_info")
    public String destroy(){
        return "/school/destroy_info";
    }


    @GetMapping("call_info_propose")
    public String propose(){
        return "/school/call_info_propose";
    }

    @GetMapping("propose_write")
    public String write(){
        return "/school/propose_write";
    }


}
