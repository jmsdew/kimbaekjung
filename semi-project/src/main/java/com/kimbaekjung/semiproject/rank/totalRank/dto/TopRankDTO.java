package com.kimbaekjung.semiproject.rank.totalRank.dto;

public class TopRankDTO {
    private String categoryName;
    private String name;
    private int score;

    public TopRankDTO() {
    }

    public TopRankDTO(String categoryName, String name, int score) {
        this.categoryName = categoryName;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "TopRankDTO{" +
                "categoryName='" + categoryName + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
