package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class InsertDTO {

    private String name;

    private int userCodes;

    private String status;

    private Date enroll;

    public InsertDTO() {
    }

    public InsertDTO(String name, int userCodes, String status, Date enroll) {
        this.name = name;
        this.userCodes = userCodes;
        this.status = status;
        this.enroll = enroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserCodes() {
        return userCodes;
    }

    public void setUserCodes(int userCodes) {
        this.userCodes = userCodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEnroll() {
        return enroll;
    }

    public void setEnroll(Date enroll) {
        this.enroll = enroll;
    }

    @Override
    public String toString() {
        return "InsertDTO{" +
                "name='" + name + '\'' +
                ", userCodes=" + userCodes +
                ", status='" + status + '\'' +
                ", enroll=" + enroll +
                '}';
    }
}
