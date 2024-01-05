package com.kimbaekjung.semiproject.management.controller;

import com.kimbaekjung.semiproject.management.dto.*;
import com.kimbaekjung.semiproject.management.service.ManageService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/management/*")
public class manageController {
    @Autowired
    private ManageService manageService;


    @GetMapping("student_manage")
    public ModelAndView pickName(ModelAndView mv, HttpSession session){
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        List<manageDTO> picks = manageService.pickName(userCode);
        mv.addObject("picks",picks);
        mv.setViewName("/management/student_manage");

        return mv;
    }

    @PostMapping("select")
    public ModelAndView selectStudent(ModelAndView mv, HttpSession session, @RequestParam("pickStudentCode") int pickStudentCode) {

        // 학생정보 다시 넘김
        Object a = session.getAttribute("userCodes");
        String b = a.toString();
        int userCode = Integer.parseInt(b);
        List<manageDTO> picks = manageService.pickName(userCode);
        mv.addObject("picks",picks);

        // 출석 결과
        List<AttendDTO> absentList = manageService.absent(pickStudentCode);
        int absentCount = absentList.size();

        List<AttendDTO> lateList = manageService.late(pickStudentCode);
        int lateCount = lateList.size();

        List<AttendDTO> leaveList = manageService.leave(pickStudentCode);
        int leaveCount = leaveList.size();

        List<AttendDTO> resultList = manageService.result(pickStudentCode);
        int resultCount = resultList.size();

        mv.addObject("pickStudentCode", pickStudentCode);
        mv.addObject("absentCount", absentCount);
        mv.addObject("lateCount", lateCount);
        mv.addObject("leaveCount", leaveCount);
        mv.addObject("resultCount", resultCount);

        // 칭찬 내역
        List<PraiseDTO> praiseList = manageService.praise(pickStudentCode);
        mv.addObject("praiseList", praiseList);

        mv.setViewName("/management/student_manage");

        return mv;
    }

    @GetMapping("{selectedOption}")
    @ResponseBody
    public List<RecommendDTO> recommend(@PathVariable int selectedOption) {
        List<RecommendDTO> recommendList = manageService.recommend(selectedOption);
        System.out.println(recommendList.toString());

        return recommendList;
    }

    @PostMapping("{selectedAttend}")
    @ResponseBody
    public List<AttendDetailDTO> attendDetail(@PathVariable String selectedAttend, @RequestBody Map<String, Object> requestDate) {

        if (Objects.equals(selectedAttend, "absent")) {
            selectedAttend = "결석";
        } else if (Objects.equals(selectedAttend, "late")) {
            selectedAttend = "지각";
        } else if (Objects.equals(selectedAttend, "leave")) {
            selectedAttend = "조퇴";
        } else if (Objects.equals(selectedAttend, "result")) {
            selectedAttend = "결과";
        }

        System.out.println(requestDate);
        String pickStudentCodeString = (String) requestDate.get("pickStudentCode");
        int pickStudentCode = Integer.parseInt(pickStudentCodeString);
        System.out.println(pickStudentCode);
        System.out.println(selectedAttend);

        List<AttendDetailDTO> attendDetailList = manageService.attendDetail(selectedAttend, pickStudentCode);
        System.out.println(attendDetailList.toString());

        return attendDetailList;
    }


}
