package com.kimbaekjung.semiproject.school.service;

import com.kimbaekjung.semiproject.school.dto.*;
import com.kimbaekjung.semiproject.school.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolDAO schoolDAO;

    @Autowired
    private NotificationDAO notificationDAO;

    @Autowired
    private ProposeDAO proposeDAO;

    @Autowired
    private NotiSearchDAO notiSearchDAO;

    @Autowired
    private PropSearchDAO propSearchDAO;

    @Autowired
    private InsertDAO insertDAO;

    @Autowired
    private AttendNumDAO attendNumDAO;

    @Autowired
    private DeleteDAO deleteDAO;

    public List<SchoolDTO> oneName(int userCodes) {
        List<SchoolDTO> nameOne= schoolDAO.oneName(userCodes);

        return nameOne;
    }


    public List<NotificationDTO> titles() {
        List<NotificationDTO> titles = notificationDAO.titles();

        return titles;
    }


    public List<ProposeDTO> propose() {
        List<ProposeDTO> propose = proposeDAO.propose();

        return propose;
    }

    public List<SearchNotiDTO> searchNoti(String keyword) {
        List<SearchNotiDTO> searchNoti = notiSearchDAO.searchNoti(keyword);

        return searchNoti;
    }


    public List<SearchPropDTO> searchProp(String keyword) {
        List<SearchPropDTO> searchProp = propSearchDAO.searchProp(keyword);

        return searchProp;
    }

    public int insert(InsertDTO insertDTO, int userCodes) {
        int insert = insertDAO.insert(insertDTO, userCodes);

        return insert;
    }

    public int deleteStudentByCode(int studentCode) {
        deleteDAO.delete(studentCode);
       return  deleteDAO.delete(studentCode);
    }

//    public List<SchoolDTO> getStudentDetails(String studentName) {
//        List<SchoolDTO> nameOne= schoolDAO.oneName();
//
//        return nameOne;
//    }

    public List<AttendNumDTO> getStudentDetail(int studentCode) {
        List<AttendNumDTO> attendNum = attendNumDAO.getStudentDetail(studentCode);
        return attendNum;
    }



}
