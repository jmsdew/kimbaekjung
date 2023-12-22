package com.kimbaekjung.semiproject.main.dto;

public class PraiseDTO {

    private String name;
    private String date;
    private int point;
    private int category;
    private String praise;

    public PraiseDTO() {
    }

    public PraiseDTO(String name, String date, int point, int category, String praise) {
        this.name = name;
        this.date = date;
        this.point = point;
        this.category = category;
        this.praise = praise;
    }

    @Override
    public String toString() {
        return "PraiseDTO{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", point=" + point +
                ", category=" + category +
                ", praise='" + praise + '\'' +
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getPraise() {
        return praise;
    }

    public void setPraise(String praise) {
        this.praise = praise;
    }
}
