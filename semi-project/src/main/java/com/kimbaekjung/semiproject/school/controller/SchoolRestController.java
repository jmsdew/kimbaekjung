package com.kimbaekjung.semiproject.school.controller;

import com.kimbaekjung.semiproject.school.dto.AttendNumDTO;
import com.kimbaekjung.semiproject.school.dto.InsertDTO;
import com.kimbaekjung.semiproject.school.dto.SchoolDTO;
import com.kimbaekjung.semiproject.school.service.SchoolService;
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
    public List<SchoolDTO> names(){
        List<SchoolDTO> names = schoolService.oneName();

        return names;
    }

    @GetMapping("popup_info/{studentCode}")
    public List<AttendNumDTO> getStudentDetail(@PathVariable("studentCode") int studentCode){
        List<AttendNumDTO> attendNum = schoolService.getStudentDetail(studentCode);
        return attendNum;
    }

    @PostMapping("add")
    public List<SchoolDTO> addNames(InsertDTO insertDTO){
        // 추가
        schoolService.insert(insertDTO);
        // 불러오기
        List<SchoolDTO> names = schoolService.oneName();

        return names;
    }

    @PostMapping("delete/{studentCode}")
    public List<SchoolDTO> deleteStudent(@PathVariable int studentCode) {
        //업데이트
         schoolService.deleteStudentByCode(studentCode);

        List<SchoolDTO> names = schoolService.oneName();

        return names;
    }


}
