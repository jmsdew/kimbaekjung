package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class NotificationDTO {
    private int code;
    private String name;
    private Date noticeDate;
    private String comment;

    public NotificationDTO() {
    }

    public NotificationDTO(int code, String name, Date noticeDate, String comment) {
        this.code = code;
        this.name = name;
        this.noticeDate = noticeDate;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "NotificationDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", noticeDate=" + noticeDate +
                ", comment='" + comment + '\'' +
                '}';
    }
}




