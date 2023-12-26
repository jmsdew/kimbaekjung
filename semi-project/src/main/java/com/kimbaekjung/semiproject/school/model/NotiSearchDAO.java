package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.SearchNotiDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NotiSearchDAO {
    List<SearchNotiDTO> searchNoti(String keyword);
}
