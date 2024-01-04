package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class AttendNumDTO {
//    private String attendKind;
//
//    private int count;

    private int code;
    private String kind;
    private Date date;
    private String reason;
    private String status;


    public AttendNumDTO() {
    }

    public AttendNumDTO(int code, String kind, Date date, String reason, String status) {
        this.code = code;
        this.kind = kind;
        this.date = date;
        this.reason = reason;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AttendNumDTO{" +
                "code=" + code +
                ", kind='" + kind + '\'' +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
