package com.kimbaekjung.semiproject.rank.totalRank.model;

import com.kimbaekjung.semiproject.rank.totalRank.dto.RankDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RankDAO {
    List<RankDTO> firstRank(int userCode);

    List<RankDTO> secondRank(int userCode);

    List<RankDTO> thirdRank(int userCode);

    List<RankDTO> studentRank(int userCode);
    List<RankDTO> temaRank1(int userCode);
    List<RankDTO> temaRank2(int userCode);
    List<RankDTO> temaRank3(int userCode);
    List<RankDTO> temaRank4(int userCode);
    List<RankDTO> temaRank5(int userCode);
    List<RankDTO> temaRank6(int userCode);
    List<RankDTO> temaRank7(int userCode);
    List<RankDTO> temaRank8(int userCode);
    List<RankDTO> temaRank9(int userCode);
    List<RankDTO> temaRank10(int userCode);
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
