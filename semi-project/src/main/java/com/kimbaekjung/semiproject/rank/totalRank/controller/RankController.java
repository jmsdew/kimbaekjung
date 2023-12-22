package com.kimbaekjung.semiproject.rank.totalRank.controller;

import com.kimbaekjung.semiproject.rank.totalRank.dto.RankDTO;
import com.kimbaekjung.semiproject.rank.totalRank.dto.TopRankDTO;
import com.kimbaekjung.semiproject.rank.totalRank.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/rank/*")
public class RankController {

    @Autowired
    private RankService service;

    @GetMapping("rank")
    public ModelAndView rank(ModelAndView mv){
        List<RankDTO> students = service.studentRank();
        List<TopRankDTO> ranking = service.topRank();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("ranking",ranking);
        mv.addObject("students",students);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/rank");

        return mv;
    }
    @GetMapping("temaRank1")
    public ModelAndView temaRank1(ModelAndView mv){
        List<RankDTO> students = service.temaRank1();
        List<RankDTO> tema = service.findTema1();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();

        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank2")
    public ModelAndView temaRank2(ModelAndView mv){
        List<RankDTO> students = service.temaRank2();
        List<RankDTO> tema = service.findTema2();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank3")
    public ModelAndView temaRank3(ModelAndView mv){
        List<RankDTO> students = service.temaRank3();
        List<RankDTO> tema = service.findTema3();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank4")
    public ModelAndView temaRank4(ModelAndView mv){
        List<RankDTO> students = service.temaRank4();
        List<RankDTO> tema = service.findTema4();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank5")
    public ModelAndView temaRank5(ModelAndView mv){
        List<RankDTO> students = service.temaRank5();
        List<RankDTO> tema = service.findTema5();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank6")
    public ModelAndView temaRank6(ModelAndView mv){
        List<RankDTO> students = service.temaRank6();
        List<RankDTO> tema = service.findTema6();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank7")
    public ModelAndView temaRank7(ModelAndView mv){
        List<RankDTO> students = service.temaRank7();
        List<RankDTO> tema = service.findTema7();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank8")
    public ModelAndView temaRank8(ModelAndView mv){
        List<RankDTO> students = service.temaRank8();
        List<RankDTO> tema = service.findTema8();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank9")
    public ModelAndView temaRank9(ModelAndView mv){
        List<RankDTO> students = service.temaRank9();
        List<RankDTO> tema = service.findTema9();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
    @GetMapping("temaRank10")
    public ModelAndView temaRank10(ModelAndView mv){
        List<RankDTO> students = service.temaRank10();
        List<RankDTO> tema = service.findTema10();
        List<RankDTO> first = service.firstRank();
        List<RankDTO> second = service.secondRank();
        List<RankDTO> third = service.thirdRank();
        mv.addObject("students",students);
        mv.addObject("tema",tema);
        mv.addObject("first",first);
        mv.addObject("second",second);
        mv.addObject("third",third);
        mv.setViewName("/rank/temaRank");

        return mv;
    }
}
