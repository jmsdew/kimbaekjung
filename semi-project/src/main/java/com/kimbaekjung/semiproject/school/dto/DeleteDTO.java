package com.kimbaekjung.semiproject.school.dto;

public class DeleteDTO {
    private int studentCode;
    private String studentName;

    public DeleteDTO() {
    }

    public DeleteDTO(int studentCode, String studentName) {
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
        return "DeleteDTO{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
