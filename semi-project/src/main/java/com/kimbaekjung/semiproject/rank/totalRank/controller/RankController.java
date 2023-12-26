package com.kimbaekjung.semiproject.rank.totalRank.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kimbaekjung.semiproject.rank.totalRank.dto.GradeDTO;
import com.kimbaekjung.semiproject.rank.totalRank.dto.RankDTO;
import com.kimbaekjung.semiproject.rank.totalRank.dto.TopRankDTO;
import com.kimbaekjung.semiproject.rank.totalRank.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/rank/*")
public class RankController {

    @Autowired
    private RankService service;
    @Autowired
    private ObjectMapper objectMapper;

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
        mv.setViewName("rank/tema/temaRank1");

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
        mv.setViewName("rank/tema/temaRank2");

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
        mv.setViewName("rank/tema/temaRank3");

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
        mv.setViewName("rank/tema/temaRank4");

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
        mv.setViewName("rank/tema/temaRank5");

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
        mv.setViewName("rank/tema/temaRank6");

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
        mv.setViewName("rank/tema/temaRank7");

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
        mv.setViewName("rank/tema/temaRank8");

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
        mv.setViewName("rank/tema/temaRank9");

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
        mv.setViewName("rank/tema/temaRank10");

        return mv;
    }

    @PostMapping("/temaRank1")
    public ResponseEntity<List<GradeDTO>> handleStudentName(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");

            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);

            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank2")
    public ResponseEntity<List<GradeDTO>> handleStudentName2(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank3")
    public ResponseEntity<List<GradeDTO>> handleStudentName3(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank4")
    public ResponseEntity<List<GradeDTO>> handleStudentName4(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank5")
    public ResponseEntity<List<GradeDTO>> handleStudentName5(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank6")
    public ResponseEntity<List<GradeDTO>> handleStudentName6(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank7")
    public ResponseEntity<List<GradeDTO>> handleStudentName7(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank8")
    public ResponseEntity<List<GradeDTO>> handleStudentName8(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank9")
    public ResponseEntity<List<GradeDTO>> handleStudentName9(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/temaRank10")
    public ResponseEntity<List<GradeDTO>> handleStudentName10(@RequestBody String jsonString) {
        // JSON 문자열을 JsonNode로 파싱
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String studentName = jsonNode.get("studentName").asText();
            String tema = jsonNode.get("tema").asText();
            tema = tema.replaceAll("\\[", "").replaceAll("\\]", "");
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setName(studentName);
            gradeDTO.setTema(tema);
            List<GradeDTO> rankReason = service.gradeReason(gradeDTO);
            return ResponseEntity.ok(rankReason);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
