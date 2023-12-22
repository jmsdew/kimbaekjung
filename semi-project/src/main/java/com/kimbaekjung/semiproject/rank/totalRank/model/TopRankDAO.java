package com.kimbaekjung.semiproject.rank.totalRank.model;

import com.kimbaekjung.semiproject.rank.totalRank.dto.TopRankDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TopRankDAO {
    List<TopRankDTO> topRank();
}
