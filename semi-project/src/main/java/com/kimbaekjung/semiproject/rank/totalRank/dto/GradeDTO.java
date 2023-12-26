package com.kimbaekjung.semiproject.rank.totalRank.dto;

public class GradeDTO {

    private String tema;
    private String name;
    private int point;
    private String reason;
    private String date;

    public GradeDTO() {
    }

    public GradeDTO(String tema, String name, int point, String reason, String date) {
        this.tema = tema;
        this.name = name;
        this.point = point;
        this.reason = reason;
        this.date = date;
    }

    @Override
    public String toString() {
        return "GradeDTO{" +
                "tema='" + tema + '\'' +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", reason='" + reason + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
