package com.kimbaekjung.semiproject.main.dto;

public class UserInfoDTO {
    private String school;
    private int grade;
    private int clas;

    public UserInfoDTO() {
    }

    public UserInfoDTO(String school, int grade, int clas) {
        this.school = school;
        this.grade = grade;
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "school='" + school + '\'' +
                ", grade=" + grade +
                ", clas=" + clas +
                '}';
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

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }


}
