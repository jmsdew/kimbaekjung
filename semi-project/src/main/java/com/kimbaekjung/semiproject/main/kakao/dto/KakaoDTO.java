package com.kimbaekjung.semiproject.main.kakao.dto;

public class KakaoDTO {
    private int code;
    private String email;

    public KakaoDTO() {
    }

    public KakaoDTO(int code, String email) {
        this.code = code;
        this.email = email;
    }

    @Override
    public String toString() {
        return "KakaoDTO{" +
                "code=" + code +
                ", email='" + email + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
