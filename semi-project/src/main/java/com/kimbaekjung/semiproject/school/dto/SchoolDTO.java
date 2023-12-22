package com.kimbaekjung.semiproject.school.dto;

public class SchoolDTO {

    private int studentCode;
    private String studentName;

    public SchoolDTO() {
    }

    public SchoolDTO(int studentCode, String studentName) {
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
        return "SchoolDTO{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

