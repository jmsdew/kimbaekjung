package com.kimbaekjung.semiproject.main.dto;

public class AttendanceDTO {

    private String name;
    private String date;
    private String kind;
    private String reason;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String name, String date, String kind, String reason) {
        this.name = name;
        this.date = date;
        this.kind = kind;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "AttendanceDTO{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", kind='" + kind + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
