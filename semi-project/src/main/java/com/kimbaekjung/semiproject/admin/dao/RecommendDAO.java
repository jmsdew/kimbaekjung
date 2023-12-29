package com.kimbaekjung.semiproject.admin.dao;

import com.kimbaekjung.semiproject.admin.dto.RecommendSelectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecommendDAO {
    List<RecommendSelectDTO> selectAllRecommend();

    List<RecommendSelectDTO> selectAllRecommend(String criteria, String keyword);

    int registRecommend(int categoryCode, String content);

    int deleteRecommend(String[] selectedRecommendCodeList);

    int modifyRecommend(int recommendCode, int categoryCode, String content);
}
