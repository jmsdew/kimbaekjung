package com.kimbaekjung.semiproject.school.controller;

import com.kimbaekjung.semiproject.main.dto.StudentDTO;
import com.kimbaekjung.semiproject.school.dto.*;
import com.kimbaekjung.semiproject.school.service.SchoolService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/student/*")
public class SchoolRestController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("list")
    public List<SchoolDTO> names(HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int c = Integer.parseInt(b);
        List<SchoolDTO> names = schoolService.oneName(c);

        return names;
    }



//    @GetMapping("studentNum")
//    public List<dto> studentNum(ModelAndView mv, @RequestParam("studentCode") int studentCode){
//        List<> studentNum = schoolService.studentNum(studentCode);
//
//
//        return studentNum;
//    }
//    @GetMapping("popup_info/{studentCode}")
//    public ModelAndView getStudentDetail(ModelAndView mv, @PathVariable("studentCode") int studentCode){
//        System.out.println(studentCode);
//        List<AttendNumDTO> attendNum = schoolService.getStudentDetail(studentCode);
//        mv.addObject("attendNum", attendNum);
//
//        mv.setViewName("/school/mypage_info");
//        System.out.println(mv);
//        return mv;
//    }

//    @GetMapping("one_student")
//    public ModelAndView oneStudent(ModelAndView mv, @RequestParam int studentCode){
//        System.out.println(studentCode);
//        List<OneStudentDTO> oneStudent = schoolService.oneStudent(studentCode);
//        mv.addObject("oneStudent", oneStudent);
//        mv.setViewName("/school/mypage_info");
//
//        return mv;
//    }


    @PostMapping("add")
    public List<SchoolDTO> addNames(InsertDTO insertDTO, HttpSession session){
        Object userCodeSession = session.getAttribute("userCodes");
        String userCodeStr = userCodeSession.toString();
        int userCode = Integer.parseInt(userCodeStr);
        // 추가

        insertDTO.setUserCodes(userCode);

        schoolService.insert(insertDTO);
        // 불러오기
        List<SchoolDTO> names = schoolService.oneName(userCode);

        return names;
    }

    @PostMapping("delete")
    public List<SchoolDTO> deleteStudent(DeleteDTO deleteDTO, HttpSession session) {
        Object userCodeSession = session.getAttribute("userCodes");
        String userCodeStr = userCodeSession.toString();
        int userCode = Integer.parseInt(userCodeStr);
        //업데이트
         schoolService.deleteStudentByCode(deleteDTO);

        List<SchoolDTO> names = schoolService.oneName(userCode);

        return names;
    }

    @PostMapping("update")
    public List<SchoolDTO> updateStudent(UpdateDTO updateDTO, HttpSession session){
        Object userCodeSession = session.getAttribute("userCodes");
        String userCodeStr = userCodeSession.toString();
        int userCode = Integer.parseInt(userCodeStr);

        schoolService.updateStudentByCode(updateDTO);


        List<SchoolDTO> names = schoolService.oneName(userCode);


        return names;
    }


}
