package com.kimbaekjung.semiproject.admin.dao;

import com.kimbaekjung.semiproject.admin.dto.NoticeSelectDTO;
import com.kimbaekjung.semiproject.admin.dto.SearchNoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDAO {
    List<NoticeSelectDTO> selectAllNotice();

    List<SearchNoticeDTO> searchNotice(String keyword);

    int deleteNotice(String[] selectedNoticeCodeList);

    int registNotice(String name, String content);
}
