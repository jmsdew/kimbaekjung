package com.kimbaekjung.semiproject.school.controller;


import com.kimbaekjung.semiproject.school.dto.*;
import com.kimbaekjung.semiproject.school.service.SchoolService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/school/*")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping("mypage_info")
    public ModelAndView namesBtn(ModelAndView mv, HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int c = Integer.parseInt(b);
        List<SchoolDTO> names = schoolService.oneName(c);
//        SchoolDTO names = schoolService.oneName(schoolDTO);
        mv.addObject("names",names);
        mv.setViewName("/school/mypage_info");

        return mv;
    }


//    @GetMapping("student/list")
//    public

//    @GetMapping("popup_info")
//    public ModelAndView attendNum(ModelAndView mv){
//        List<AttendNumDTO> attendNum = schoolService.attendNum();
//        mv.addObject("attendNum",attendNum);
//        mv.setViewName("/school/mypage_info");
//
//        return mv;
//    }


//    @GetMapping("regist")
//    public void insert(){};
//
//    @PostMapping("regist")
//    public ModelAndView insert(ModelAndView mv, InsertDTO insertDTO, HttpSession session) {
//        Object a = session.getAttribute("userCodes");
//        String b = a.toString();
//        int c = Integer.parseInt(b);
//        int insert = schoolService.insert(insertDTO, c);
//        if (insert >= 0) {
//            System.out.println("exception");
//        }
//        mv.setViewName("/school/mypage_info");
//
//        return mv;
//    }





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

    @PostMapping("restart")
    public ModelAndView restartBtn(ModelAndView mv,RestartDTO restartDTO,HttpSession session){
        Object userCodeSession = session.getAttribute("userCodes");
        String userCodeStr = userCodeSession.toString();
        int userCodes = Integer.parseInt(userCodeStr);

        schoolService.restart(restartDTO, userCodes);

        mv.setViewName("/school/restart_info");

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


//    th:href="@{/school/one_noti(notiCode=${title1.code},
//    notiName=${title1.name},
//    notiContent=${title1.comment},
//    notiDate=${#dates.format(title1.noticeDate, 'yyyy.MM.dd')})}"
//    @GetMapping("one_noti")
//    public ModelAndView oneNoti(ModelAndView mv, @RequestParam int notiCode, ){
//
//        return "/school/one_noti"; }

    @GetMapping("one_noti")
    public String oneNoti(){return "/school/one_noti"; }

    @GetMapping("one_propose")
    public String oneProp(){ return "/school/one_propose"; }

}
