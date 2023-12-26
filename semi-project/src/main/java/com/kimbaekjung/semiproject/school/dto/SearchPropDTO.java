package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class SearchPropDTO {
    private int code;
    private String title;

    private String email;

    private Date enrollD;

    private String keyword;

    public SearchPropDTO() {
    }

    public SearchPropDTO(int code, String title, String email, Date enrollD, String keyword) {
        this.code = code;
        this.title = title;
        this.email = email;
        this.enrollD = enrollD;
        this.keyword = keyword;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "SearchPropDTO{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", enrollD=" + enrollD +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
