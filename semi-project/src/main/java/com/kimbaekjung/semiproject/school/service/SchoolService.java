package com.kimbaekjung.semiproject.school.service;

import com.kimbaekjung.semiproject.school.dto.NotificationDTO;
import com.kimbaekjung.semiproject.school.dto.ProposeDTO;
import com.kimbaekjung.semiproject.school.dto.SchoolDTO;
import com.kimbaekjung.semiproject.school.model.NotificationDAO;
import com.kimbaekjung.semiproject.school.model.ProposeDAO;
import com.kimbaekjung.semiproject.school.model.SchoolDAO;
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
}
