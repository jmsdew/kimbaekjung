package com.kimbaekjung.semiproject.management.service;

import com.kimbaekjung.semiproject.management.dto.manageDTO;
import com.kimbaekjung.semiproject.management.model.ManageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageService {


    @Autowired
    private ManageDAO manageDAO;



    public List<manageDTO> pickName() {
        List<manageDTO> picks = manageDAO.picks();

        return picks;
    }
}
