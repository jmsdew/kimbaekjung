package com.kimbaekjung.semiproject.main.dto;

public class StudentDTO {
    private int code;
    private String name;
    private int score;

    public StudentDTO() {
    }

    public StudentDTO(int code, String name, int score) {
        this.code = code;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
}
