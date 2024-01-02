package com.kimbaekjung.semiproject.school.dto;

public class RestartDTO {
    private int userCodes;

    public RestartDTO() {
    }

    public RestartDTO(int userCodes) {
        this.userCodes = userCodes;
    }

    public int getUserCodes() {
        return userCodes;
    }

    public void setUserCodes(int userCodes) {
        this.userCodes = userCodes;
    }

    @Override
    public String toString() {
        return "RestartDTO{" +
                "userCodes=" + userCodes +
                '}';
    }
}
