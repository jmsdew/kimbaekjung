package com.kimbaekjung.semiproject.main.dto;

public class SitDTO {
    private String studentName;
    private String student;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public SitDTO() {
    }

    public SitDTO(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "SitDTO{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}
