package com.kimbaekjung.semiproject.admin.dao;

import com.kimbaekjung.semiproject.admin.dto.ProposeAnswerDTO;
import com.kimbaekjung.semiproject.admin.dto.ProposeSelectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminProposeDAO {
    List<ProposeSelectDTO> selectAllPropose();

    ProposeAnswerDTO proposeAnswer(int proposeCode, String proposeName);

    int answerRegist(String proposeAnswer, int proposeCode);

    int deletePropose(String[] selectedProposeCodeList);

    List<ProposeSelectDTO> selectAllPropose(String keyword);
}
