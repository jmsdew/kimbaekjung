package com.kimbaekjung.semiproject.school.dto;

public class AttendNumDTO {
    private String attendKind;

    private int count;

    public AttendNumDTO() {
    }

    public AttendNumDTO(String attendKind, int count) {
        this.attendKind = attendKind;
        this.count = count;
    }

    public String getAttendKind() {
        return attendKind;
    }

    public void setAttendKind(String attendKind) {
        this.attendKind = attendKind;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "attendNumDTO{" +
                "attendKind='" + attendKind + '\'' +
                ", count=" + count +
                '}';
    }
}
