package com.kimbaekjung.semiproject.main.kakao.dto;

public class UserInfoCode {
    private String email;
    private int userCode;

    public UserInfoCode() {
    }

    public UserInfoCode(String email, int userCode) {
        this.email = email;
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "UserInfoCode{" +
                "email='" + email + '\'' +
                ", userCode=" + userCode +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }
}
