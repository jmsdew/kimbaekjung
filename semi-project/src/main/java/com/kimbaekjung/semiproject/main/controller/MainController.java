package com.kimbaekjung.semiproject.main.controller;

import com.kimbaekjung.semiproject.main.dto.*;
import com.kimbaekjung.semiproject.main.kakao.controller.AuthController;
import com.kimbaekjung.semiproject.main.service.Mainservice;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main/*")
public class MainController {

    @Autowired
    private Mainservice mainservice;




    @GetMapping("/main")
    public ModelAndView mainCont(ModelAndView mv, HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int c = Integer.parseInt(b);
        List<MainDTO> school = mainservice.userSchool(c);
        List<StudentDTO> student = mainservice.studentName(c);
        List<StudentDTO> student2 = mainservice.allStudent(c);

        mv.addObject("student", student);
        mv.addObject("school", school);
        mv.addObject("student2", student2);

        mv.setViewName("/main/main");
        return mv;
    }

    @PostMapping("/handleOption")
    public ModelAndView handleOption(@RequestBody Map<String, String> requestData, HttpSession session) {
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        String option = requestData.get("option");
        String studentName = requestData.get("studentName");

        ModelAndView mv = new ModelAndView();
        // 뷰 내용 추가하기 if 문으로
        if(option.equals("sitDown")){
            SitDTO sitDTO = new SitDTO();
            sitDTO.setStudentName(studentName);
            int sitDown = mainservice.sitDown(sitDTO, userCode);
            if(sitDown > 0){
                System.out.println("성공");
            }

            mv.setViewName("/main/main");
        }else if (option.equals("standUp")){

            SitDTO sitDTO = new SitDTO();
            sitDTO.setStudentName(studentName);
            int sitDown = mainservice.standUp(sitDTO, userCode);
            if(sitDown > 0){
                System.out.println("성공");
            }
            mv.setViewName("/main/main");
        }
        return mv;
    }

    @PostMapping("/processPraise")
    public ModelAndView processPraise(ModelAndView mv, PraiseDTO praiseDTO , HttpSession session) {
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        int praise = mainservice.processPraise(praiseDTO, userCode);
        if(praise > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main/main");
        return mv;
    }
    @PostMapping("/attendance")
    public ModelAndView attendance(ModelAndView mv, AttendanceDTO attendanceDTO, HttpSession session) {
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        int attendance = mainservice.attendance(attendanceDTO, userCode);
        if(attendance > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main/main");
        return mv;
    }
    @PostMapping("/userInfo")
    public ModelAndView userInfo(ModelAndView mv, UserInfoDTO userInfoDTO, HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        int info = mainservice.userInfor(userInfoDTO,userCode);
        if(info > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main/main");
        return mv;
    }

    @PostMapping("/studentInfo")
    public ModelAndView studentInfo(ModelAndView mv,String name, HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        String[] name1 = name.split(",");
        List<String> names = Arrays.asList(name1);
        System.out.println(names);
        int info = mainservice.studentInfo(names,userCode);
        mv.setViewName("/main/main");
        return mv;
    }


}
