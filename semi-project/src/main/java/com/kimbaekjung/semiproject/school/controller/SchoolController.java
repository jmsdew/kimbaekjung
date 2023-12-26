package com.kimbaekjung.semiproject.school.controller;


import com.kimbaekjung.semiproject.admin.dto.SearchNoticeDTO;
import com.kimbaekjung.semiproject.school.dto.*;
import com.kimbaekjung.semiproject.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        mv.addObject("titles",titles);
        mv.setViewName("/school/call_info_notification");

        return mv;
    }


    @GetMapping("call_info_propose")
    public ModelAndView propose(ModelAndView mv){
        List<ProposeDTO> propose = schoolService.propose();
        mv.addObject("propose",propose);
        mv.setViewName("/school/call_info_propose");

        return mv;
    }

    @PostMapping("searchNoti")
    public ModelAndView searchNoti(ModelAndView mv, @RequestParam String keyword) {
        System.out.println("keyword : " + keyword);
        List<SearchNotiDTO> searchNoti = schoolService.searchNoti(keyword);
        System.out.println(searchNoti.toString());

        mv.addObject("searchNoti", searchNoti);
        mv.setViewName("/school/noti_search");

        return mv;
    }

    @PostMapping("searchProp")
    public ModelAndView searchProp(ModelAndView mv, @RequestParam String keyword) {
        System.out.println("keyword : " + keyword);
        List<SearchPropDTO> searchProp = schoolService.searchProp(keyword);
        System.out.println(searchProp.toString());

        mv.addObject("searchProp", searchProp);
        mv.setViewName("/school/propose_search");

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



    @GetMapping("propose_write")
    public String write(){
        return "/school/propose_write";
    }


}
