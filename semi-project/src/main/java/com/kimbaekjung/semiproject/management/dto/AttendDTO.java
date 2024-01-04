package com.kimbaekjung.semiproject.management.dto;

public class AttendDTO {

    private int attendCode;

    public AttendDTO(int attendCode) {
        this.attendCode = attendCode;
    }

    public int getAttendCode() {
        return attendCode;
    }

    public void setAttendCode(int attendCode) {
        this.attendCode = attendCode;
    }

    @Override
    public String toString() {
        return "AttendDTO{" +
                "attendCode=" + attendCode +
                '}';
    }
}
