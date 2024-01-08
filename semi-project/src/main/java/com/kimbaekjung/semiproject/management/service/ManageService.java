package com.kimbaekjung.semiproject.management.service;

import com.kimbaekjung.semiproject.management.dto.*;
import com.kimbaekjung.semiproject.management.model.ManageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageService {


    @Autowired
    private ManageDAO manageDAO;



    public List<manageDTO> pickName(int userCode) {
        List<manageDTO> picks = manageDAO.picks(userCode);

        return picks;
    }

    public List<studentNameDTO> name(int pickStudentCode) {
       List<studentNameDTO> name = manageDAO.name(pickStudentCode);

       return name;
    }

    public List<AttendDTO> absent(int pickStudentCode) {
        List<AttendDTO> absentList = manageDAO.absent(pickStudentCode);

        return absentList;
    }

    public List<AttendDTO> late(int pickStudentCode) {
        List<AttendDTO> lateList = manageDAO.late(pickStudentCode);

        return lateList;
    }

    public List<AttendDTO> leave(int pickStudentCode) {
        List<AttendDTO> leaveList = manageDAO.leave(pickStudentCode);

        return leaveList;
    }

    public List<AttendDTO> result(int pickStudentCode) {
        List<AttendDTO> resultList = manageDAO.result(pickStudentCode);

        return resultList;
    }

    public List<PraiseDTO> praise(int pickStudentCode) {
        List<PraiseDTO> praiseList = manageDAO.praise(pickStudentCode);

        return praiseList;
    }

    public List<RecommendDTO> recommend(int selectedOption) {
        List<RecommendDTO> recommendList = manageDAO.recommend(selectedOption);

        return recommendList;
    }

    public List<AttendDetailDTO> attendDetail(String selectedAttend, int pickStudentCode) {
        List<AttendDetailDTO> attendDetailList = manageDAO.attendDetail(selectedAttend, pickStudentCode);

        return attendDetailList;
    }
}
