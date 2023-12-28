package com.kimbaekjung.semiproject.main.kakao.model;

import com.kimbaekjung.semiproject.main.kakao.dto.KakaoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KakaoDAO {
    List<KakaoDTO> selectEmail();

    int signUp(String email);

    KakaoDTO userCode(String email);
}
