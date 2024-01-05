package com.kimbaekjung.semiproject.school.dto;

public class OneStudentDTO {
    private int attendCode;

    public OneStudentDTO() {
    }

    public OneStudentDTO(int attendCode) {
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
        return "OneStudentDTO{" +
                "attendCode=" + attendCode +
                '}';
    }
}
