package com.kimbaekjung.semiproject.rank.totalRank.model;

import com.kimbaekjung.semiproject.rank.totalRank.dto.RankDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RankDAO {
    List<RankDTO> firstRank();

    List<RankDTO> secondRank();

    List<RankDTO> thirdRank();

    List<RankDTO> studentRank();
    List<RankDTO> temaRank1();
    List<RankDTO> temaRank2();
    List<RankDTO> temaRank3();
    List<RankDTO> temaRank4();
    List<RankDTO> temaRank5();
    List<RankDTO> temaRank6();
    List<RankDTO> temaRank7();
    List<RankDTO> temaRank8();
    List<RankDTO> temaRank9();
    List<RankDTO> temaRank10();
    List<RankDTO> findTema1();
    List<RankDTO> findTema2();
    List<RankDTO> findTema3();
    List<RankDTO> findTema4();
    List<RankDTO> findTema5();
    List<RankDTO> findTema6();
    List<RankDTO> findTema7();
    List<RankDTO> findTema8();
    List<RankDTO> findTema9();
    List<RankDTO> findTema10();
}
