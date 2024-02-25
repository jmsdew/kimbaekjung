package com.kimbaekjung.semiproject.main.kakao.controller;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kimbaekjung.semiproject.main.dto.MainDTO;
import com.kimbaekjung.semiproject.main.dto.StudentDTO;
import com.kimbaekjung.semiproject.main.kakao.dto.KakaoDTO;
import com.kimbaekjung.semiproject.main.kakao.model.KakaoDAO;
import com.kimbaekjung.semiproject.main.kakao.service.KakaoAPI;
import com.kimbaekjung.semiproject.main.service.Mainservice;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/oauth")
public class AuthController {

    @Autowired
    private KakaoAPI kakaoAPI;
    @Autowired
    private Mainservice mainservice;
    @Autowired
    private KakaoDAO kakaoDAO;

/*
    @ResponseBody
    @GetMapping("/kakao")
    public void kakaoCallback(@RequestParam String code) {
        System.out.println(code);
    }
*/

    @RequestMapping("/kakao")
    public ModelAndView login(@RequestParam("code") String code, HttpSession session){
        String access_Token = kakaoAPI.getAccessToken(code);

        HashMap<String, Object> userInfo = kakaoAPI.getUserInfo(access_Token);


            session.setAttribute("userId", userInfo.get("email"));
            session.setAttribute("access_Token", access_Token);
            session.setMaxInactiveInterval(36000);


        Object emails = userInfo.get("email");
        String a = emails.toString();

        KakaoDTO userCode = kakaoDAO.userCode(a);

        int userCodes = userCode.getCode();
        session.setAttribute("userCodes", userCodes);


        List<MainDTO> school = mainservice.userSchool(userCodes);
        List<StudentDTO> student = mainservice.studentName(userCodes);
        List<StudentDTO> student2 = mainservice.allStudent(userCodes);

        ModelAndView mv = new ModelAndView();
/*        mv.addObject("userCodes", userCodes);*/
        mv.addObject("student", student);
        mv.addObject("school", school);
        mv.addObject("student2", student2);

        mv.setViewName("/main/main");
        return mv;
    }



}
