package com.kimbaekjung.semiproject.school.service;

import com.kimbaekjung.semiproject.school.dto.*;
import com.kimbaekjung.semiproject.school.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<SchoolDTO> oneName() {
        List<SchoolDTO> nameOne= schoolDAO.oneName();

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
}
