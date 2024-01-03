package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class ProposeDTO {
    private int code;
    private String title;

    private String email;

    private Date enrollD;

    private String comment;

    public ProposeDTO() {
    }

    public ProposeDTO(int code, String title, String email, Date enrollD, String comment) {
        this.code = code;
        this.title = title;
        this.email = email;
        this.enrollD = enrollD;
        this.comment = comment;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEnrollD() {
        return enrollD;
    }

    public void setEnrollD(Date enrollD) {
        this.enrollD = enrollD;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ProposeDTO{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", enrollD=" + enrollD +
                ", comment='" + comment + '\'' +
                '}';
    }
}