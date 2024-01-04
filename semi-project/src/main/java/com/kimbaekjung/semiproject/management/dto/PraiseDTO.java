package com.kimbaekjung.semiproject.management.dto;

public class PraiseDTO {

    private String praiseCategory;
    private String praiseContent;
    private int praiseScore;
    private String praiseDate;

    public PraiseDTO(String praiseCategory, String praiseContent, int praiseScore, String praiseDate) {
        this.praiseCategory = praiseCategory;
        this.praiseContent = praiseContent;
        this.praiseScore = praiseScore;
        this.praiseDate = praiseDate;
    }

    public String getPraiseCategory() {
        return praiseCategory;
    }

    public void setPraiseCategory(String praiseCategory) {
        this.praiseCategory = praiseCategory;
    }

    public String getPraiseContent() {
        return praiseContent;
    }

    public void setPraiseContent(String praiseContent) {
        this.praiseContent = praiseContent;
    }

    public int getPraiseScore() {
        return praiseScore;
    }

    public void setPraiseScore(int praiseScore) {
        this.praiseScore = praiseScore;
    }

    public String getPraiseDate() {
        return praiseDate;
    }

    public void setPraiseDate(String praiseDate) {
        this.praiseDate = praiseDate;
    }

    @Override
    public String toString() {
        return "PraiseDTO{" +
                "praiseCategory='" + praiseCategory + '\'' +
                ", praiseContent='" + praiseContent + '\'' +
                ", praiseScore=" + praiseScore +
                ", praiseDate='" + praiseDate + '\'' +
                '}';
    }
}
