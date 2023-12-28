package com.kimbaekjung.semiproject.main.service;


import com.kimbaekjung.semiproject.main.dto.*;
import com.kimbaekjung.semiproject.main.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mainservice {

    @Autowired
    private MainDAO mainDAO;
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private AttendanceDAO attendanceDAO;
    @Autowired
    private SitDAO sitDAO;
    @Autowired
    private PraiseDAO praiseDAO;


    public List<MainDTO> userSchool(int userCodes) {
        List<MainDTO> school = mainDAO.userSchool(userCodes);
        return school;
    }

    public List<StudentDTO> studentName(int userCodes) {
        List<StudentDTO> student = studentDAO.studentName(userCodes);
        return student;
    }

    public List<StudentDTO> allStudent(int userCodes) {
        List<StudentDTO> student2 = studentDAO.allStudent(userCodes);
        return student2;
    }

    public int sitDown(SitDTO sitDTO) {
        int sitDown = sitDAO.sitDown(sitDTO);
        return sitDown;
    }

    public int processPraise(PraiseDTO praiseDTO) {
        int praise = praiseDAO.processPraise(praiseDTO);
        return praise;
    }

    public int attendance(AttendanceDTO attendanceDTO) {
        int attendance = attendanceDAO.attendanceStudent(attendanceDTO);
        return attendance;
    }

    public int standUp(SitDTO sitDTO) {
        int standUp = sitDAO.standUp(sitDTO);
        return standUp;
    }
}
