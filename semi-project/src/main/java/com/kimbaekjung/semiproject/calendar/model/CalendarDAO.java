package com.kimbaekjung.semiproject.calendar.model;

import com.kimbaekjung.semiproject.calendar.dto.CalendarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarDAO {
    int calendarSave(List<CalendarDTO> calendarEvents, int userCode);

    List<CalendarDTO> eventData(int userCode);

    List<CalendarDTO> eventToday(int userCode);
}
