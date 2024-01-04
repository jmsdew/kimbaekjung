package com.kimbaekjung.semiproject.management.dto;

public class AttendDetailDTO {

    private String kind;
    private String content;
    private String regist;

    public AttendDetailDTO(String kind, String content, String regist) {
        this.kind = kind;
        this.content = content;
        this.regist = regist;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegist() {
        return regist;
    }

    public void setRegist(String regist) {
        this.regist = regist;
    }

    @Override
    public String toString() {
        return "AttendDetailDTO{" +
                "kind='" + kind + '\'' +
                ", content='" + content + '\'' +
                ", regist='" + regist + '\'' +
                '}';
    }
}
