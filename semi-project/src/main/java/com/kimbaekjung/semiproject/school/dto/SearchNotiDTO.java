package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class SearchNotiDTO {
    private int code;
    private String name;
    private Date noticeDate;

    private String keyword;

    public SearchNotiDTO() {
    }

    public SearchNotiDTO(int code, String name, Date noticeDate, String keyword) {
        this.code = code;
        this.name = name;
        this.noticeDate = noticeDate;
        this.keyword = keyword;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "SearchNotiDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", noticeDate=" + noticeDate +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}