package com.kimbaekjung.semiproject.calendar.service;

import com.kimbaekjung.semiproject.calendar.dto.CalendarDTO;
import com.kimbaekjung.semiproject.calendar.model.CalendarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarDAO calendarDAO;

    public int calendarSave(List<CalendarDTO> calendarEvents, int userCode) {
        int calendarsave = calendarDAO.calendarSave(calendarEvents, userCode);
        return calendarsave;
    }

    public List<CalendarDTO> eventData(int userCode) {
        List<CalendarDTO> data = calendarDAO.eventData(userCode);
        return data;
    }

    public List<CalendarDTO> eventToday(int userCode) {
        List<CalendarDTO> today = calendarDAO.eventToday(userCode);
        return today;
    }

}
