package com.kimbaekjung.semiproject.rank.totalRank.dto;

public class RankDTO {

    private String name;
    private int score;
    private String tema;

    public RankDTO() {
    }

    public RankDTO(String name, int score, String tema) {
        this.name = name;
        this.score = score;
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return tema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
