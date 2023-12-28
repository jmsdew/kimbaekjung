package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class InsertDTO {

    private String name;

    private int userCode;

    private String status;

    private Date enroll;

    public InsertDTO() {
    }

    public InsertDTO(String name, int userCode, String status, Date enroll) {
        this.name = name;
        this.userCode = userCode;
        this.status = status;
        this.enroll = enroll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
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
                ", userCode=" + userCode +
                ", status='" + status + '\'' +
                ", enroll=" + enroll +
                '}';
    }
}
