package com.kimbaekjung.semiproject.management.dto;

public class RecommendDTO {

    private String content;

    public RecommendDTO(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RecommendDTO{" +
                "content='" + content + '\'' +
                '}';
    }
}
