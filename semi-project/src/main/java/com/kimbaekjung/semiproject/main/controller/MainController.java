package com.kimbaekjung.semiproject.main.controller;

import com.kimbaekjung.semiproject.main.dto.*;
import com.kimbaekjung.semiproject.main.kakao.controller.AuthController;
import com.kimbaekjung.semiproject.main.service.Mainservice;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main/*")
public class MainController {

    @Autowired
    private Mainservice mainservice;

    @Autowired
    private AuthController authController;


    @GetMapping("/main")
    public ModelAndView main(ModelAndView mv, HttpSession session){
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
    public ModelAndView handleOption(@RequestBody Map<String, String> requestData) {
        String option = requestData.get("option");
        String studentName = requestData.get("studentName");

        System.out.println("Received option: " + option);
        System.out.println("Received student name: " + studentName);

        ModelAndView mv = new ModelAndView();
        // 뷰 내용 추가하기 if 문으로
        if(option.equals("sitDown")){
            SitDTO sitDTO = new SitDTO();
            sitDTO.setStudentName(studentName);
            int sitDown = mainservice.sitDown(sitDTO);
            if(sitDown > 0){
                System.out.println("성공");
            }

            mv.setViewName("/main/main");
        }else if (option.equals("standUp")){

            SitDTO sitDTO = new SitDTO();
            sitDTO.setStudentName(studentName);
            int sitDown = mainservice.standUp(sitDTO);
            if(sitDown > 0){
                System.out.println("성공");
            }
            mv.setViewName("/main/main");
        }
        return mv;
    }

    @PostMapping("/processPraise")
    public ModelAndView processPraise(ModelAndView mv, PraiseDTO praiseDTO) {
        int praise = mainservice.processPraise(praiseDTO);
        if(praise > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main/main");
        return mv;
    }
    @PostMapping("/attendance")
    public ModelAndView attendance(ModelAndView mv, AttendanceDTO attendanceDTO) {
        int attendance = mainservice.attendance(attendanceDTO);
        if(attendance > 0){
            System.out.println("성공");
        }
        mv.setViewName("/main/main");
        return mv;
    }

}
