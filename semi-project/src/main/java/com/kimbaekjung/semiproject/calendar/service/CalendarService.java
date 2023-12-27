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

    public int calendarSave(List<CalendarDTO> calendarEvents) {
        int calendarsave = calendarDAO.calendarSave(calendarEvents);
        return calendarsave;
    }

    public List<CalendarDTO> eventData() {
        List<CalendarDTO> data = calendarDAO.eventData();
        return data;
    }

    public List<CalendarDTO> eventToday() {
        List<CalendarDTO> today = calendarDAO.eventToday();
        return today;
    }

}
