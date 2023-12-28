package com.kimbaekjung.semiproject.rank.totalRank.service;

import com.kimbaekjung.semiproject.rank.totalRank.dto.GradeDTO;
import com.kimbaekjung.semiproject.rank.totalRank.dto.RankDTO;
import com.kimbaekjung.semiproject.rank.totalRank.dto.TopRankDTO;
import com.kimbaekjung.semiproject.rank.totalRank.model.GradeDAO;
import com.kimbaekjung.semiproject.rank.totalRank.model.RankDAO;
import com.kimbaekjung.semiproject.rank.totalRank.model.TopRankDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RankService {
    @Autowired
    private RankDAO rankDAO;
    @Autowired
    private TopRankDAO topRankDAO;
    @Autowired
    private GradeDAO gradeDAO;
    public List<RankDTO> studentRank(int userCode) {
        List<RankDTO> students = rankDAO.studentRank(userCode);
        if(Objects.isNull(students)){              // 반환된 결과 없음     쿼리문에서 에러 발생 체크
            System.out.println("exeception 학생이 없네요 ");
        }
        return students;
    }
    public List<TopRankDTO> topRank(int userCode) {
        List<TopRankDTO> ranking = topRankDAO.topRank(userCode);
        return ranking;
    }

    public List<RankDTO> firstRank(int userCode) {
        List<RankDTO> first = rankDAO.firstRank(userCode);
        return first;
    }

    public List<RankDTO> secondRank(int userCode) {
        List<RankDTO> second = rankDAO.secondRank(userCode);
        return second;
    }

    public List<RankDTO> thirdRank(int userCode) {
        List<RankDTO> third = rankDAO.thirdRank(userCode);
        return third;
    }
    public List<RankDTO> temaRank1(int userCode) {
        List<RankDTO> students = rankDAO.temaRank1(userCode);
        return students;
    }
    public List<RankDTO> temaRank2(int userCode) {
        List<RankDTO> students = rankDAO.temaRank2(userCode);
        return students;
    }
    public List<RankDTO> temaRank3(int userCode) {
        List<RankDTO> students = rankDAO.temaRank3(userCode);
        return students;
    }
    public List<RankDTO> temaRank4(int userCode) {
        List<RankDTO> students = rankDAO.temaRank4(userCode);
        return students;
    }
    public List<RankDTO> temaRank5(int userCode) {
        List<RankDTO> students = rankDAO.temaRank5(userCode);
        return students;
    }
    public List<RankDTO> temaRank6(int userCode) {
        List<RankDTO> students = rankDAO.temaRank6(userCode);
        return students;
    }
    public List<RankDTO> temaRank7(int userCode) {
        List<RankDTO> students = rankDAO.temaRank7(userCode);
        return students;
    }
    public List<RankDTO> temaRank8(int userCode) {
        List<RankDTO> students = rankDAO.temaRank8(userCode);
        return students;
    }
    public List<RankDTO> temaRank9(int userCode) {
        List<RankDTO> students = rankDAO.temaRank9(userCode);
        return students;
    }
    public List<RankDTO> temaRank10(int userCode) {
        List<RankDTO> students = rankDAO.temaRank10(userCode);
        return students;
    }
    public List<RankDTO> findTema1() {
        List<RankDTO> tema = rankDAO.findTema1();
        return tema;
    }
    public List<RankDTO> findTema2() {
        List<RankDTO> tema = rankDAO.findTema2();
        return tema;
    }
    public List<RankDTO> findTema3() {
        List<RankDTO> tema = rankDAO.findTema3();
        return tema;
    }
    public List<RankDTO> findTema4() {
        List<RankDTO> tema = rankDAO.findTema4();
        return tema;
    }
    public List<RankDTO> findTema5() {
        List<RankDTO> tema = rankDAO.findTema5();
        return tema;
    }
    public List<RankDTO> findTema6() {
        List<RankDTO> tema = rankDAO.findTema6();
        return tema;
    }
    public List<RankDTO> findTema7() {
        List<RankDTO> tema = rankDAO.findTema7();
        return tema;
    }
    public List<RankDTO> findTema8() {
        List<RankDTO> tema = rankDAO.findTema8();
        return tema;
    }
    public List<RankDTO> findTema9() {
        List<RankDTO> tema = rankDAO.findTema9();
        return tema;
    }
    public List<RankDTO> findTema10() {
        List<RankDTO> tema = rankDAO.findTema10();
        return tema;
    }

    public List<GradeDTO> gradeReason(GradeDTO gradeDTO, int userCode) {
        List<GradeDTO> success = gradeDAO.gradeReason(gradeDTO,userCode);
        return success;
    }
}
