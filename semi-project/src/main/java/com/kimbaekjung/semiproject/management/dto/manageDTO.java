package com.kimbaekjung.semiproject.management.dto;

public class manageDTO {
    private int studentCode;
    private String studentName;

    public manageDTO() {
    }

    public manageDTO(int studentCode, String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "manageDTO{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
