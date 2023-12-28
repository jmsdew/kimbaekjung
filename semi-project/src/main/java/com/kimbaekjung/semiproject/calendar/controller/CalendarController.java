package com.kimbaekjung.semiproject.calendar.controller;

import com.kimbaekjung.semiproject.calendar.dto.CalendarDTO;
import com.kimbaekjung.semiproject.calendar.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/calendar/*")
public class CalendarController {

    @Autowired
    private CalendarService service;
    @GetMapping("/calendar")
    public ModelAndView calendar(){
        List<CalendarDTO> schedule = service.eventToday();
        ModelAndView mv = new ModelAndView();
        mv.addObject("schedule",schedule);
        mv.setViewName("/calendar/calendar");
        return mv;
    }
    @PostMapping("/eventData")
    public ResponseEntity<List<CalendarDTO>> getEventData() {

        List<CalendarDTO> eventData = service.eventData();
        // 가져온 이벤트 데이터를 JSON 형태로 응답
        return ResponseEntity.ok(eventData);
    }


    @PostMapping("/calendarSave")
    public ResponseEntity<String> saveCalendarEvent(@RequestBody CalendarDTO calendarEvent) {
        int calendarSave = service.calendarSave(Collections.singletonList(calendarEvent));

        if (calendarSave > 0) {
            System.out.println("등록 성공");
            return ResponseEntity.ok("Success");
        } else {
            // 등록 실패 시 적절한 응답을 반환하거나 예외를 던질 수 있습니다.
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("등록 실패");
        }
    }
}
