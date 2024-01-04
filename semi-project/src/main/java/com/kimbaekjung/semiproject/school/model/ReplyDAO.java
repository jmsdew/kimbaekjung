package com.kimbaekjung.semiproject.school.model;

import com.kimbaekjung.semiproject.school.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyDAO {

    List<ReplyDTO> propReply(int propCode);
}
