package com.kimbaekjung.semiproject.main.dto;

public class MainDTO {

    private String school;
    private int grade;
    private int kind;
    private int total;

    public MainDTO() {
    }

    public MainDTO(String school, int grade, int kind, int total) {
        this.school = school;
        this.grade = grade;
        this.kind = kind;
        this.total = total;
    }

    @Override
    public String toString() {
        return " "+ school + grade+"학년 " + kind +"반 "+ "  총원" + total+ " ";
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
