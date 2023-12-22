package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.NotificationDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NotificationDAO {
    List<NotificationDTO> titles();
}
