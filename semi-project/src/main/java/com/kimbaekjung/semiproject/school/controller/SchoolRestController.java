package com.kimbaekjung.semiproject.school.controller;

import com.kimbaekjung.semiproject.school.dto.AttendNumDTO;
import com.kimbaekjung.semiproject.school.dto.InsertDTO;
import com.kimbaekjung.semiproject.school.dto.SchoolDTO;
import com.kimbaekjung.semiproject.school.service.SchoolService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("popup_info/{studentCode}")
    public List<AttendNumDTO> getStudentDetail(@PathVariable("studentCode") int studentCode){
        List<AttendNumDTO> attendNum = schoolService.getStudentDetail(studentCode);
        return attendNum;
    }

    @PostMapping("add")
    public List<SchoolDTO> addNames(InsertDTO insertDTO,HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int c = Integer.parseInt(b);
        // 추가
        schoolService.insert(insertDTO, c);
        // 불러오기
        List<SchoolDTO> names = schoolService.oneName(c);

        return names;
    }

    @PostMapping("delete/{studentCode}")
    public List<SchoolDTO> deleteStudent(@PathVariable int studentCode, HttpSession session) {
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int c = Integer.parseInt(b);
        //업데이트
         schoolService.deleteStudentByCode(studentCode);

        List<SchoolDTO> names = schoolService.oneName(c);

        return names;
    }


}
