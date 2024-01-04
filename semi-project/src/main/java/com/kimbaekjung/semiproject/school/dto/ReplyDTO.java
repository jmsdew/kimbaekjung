package com.kimbaekjung.semiproject.school.dto;

public class ReplyDTO {
    private String reply;

    public ReplyDTO() {
    }

    public ReplyDTO(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "ReplyDTO{" +
                "reply='" + reply + '\'' +
                '}';
    }
}
