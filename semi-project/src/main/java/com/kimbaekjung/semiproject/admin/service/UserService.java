package com.kimbaekjung.semiproject.admin.service;

import com.kimbaekjung.semiproject.admin.dao.UserDAO;
import com.kimbaekjung.semiproject.admin.dto.UserSelectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<UserSelectDTO> selectAllUser() {
        List<UserSelectDTO> userList = userDAO.selectAllUser(); // user를 List형으로 꺼내옴
        if (Objects.isNull(userList)) { // userDAO.selectAllUser() 에서 반환된 user가 없을 경우
            System.out.println("등록된 user가 없습니다.");
        }
        return userList; // userDAO.selectAllUser() 에서 반환된 userList 반환
    }
}