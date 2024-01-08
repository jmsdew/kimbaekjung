package com.kimbaekjung.semiproject.school.dto;

import java.util.Date;

public class AttendListDTO {
    private int attendCode;
    private Date registDate;
    private String attendKind;
    private String reason;

    private String status;

    public AttendListDTO() {
    }

    public AttendListDTO(int attendCode, Date registDate, String attendKind, String reason, String status) {
        this.attendCode = attendCode;
        this.registDate = registDate;
        this.attendKind = attendKind;
        this.reason = reason;
        this.status = status;
    }

    public int getAttendCode() {
        return attendCode;
    }

    public void setAttendCode(int attendCode) {
        this.attendCode = attendCode;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public String getAttendKind() {
        return attendKind;
    }

    public void setAttendKind(String attendKind) {
        this.attendKind = attendKind;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AttendListDTO{" +
                "attendCode=" + attendCode +
                ", registDate=" + registDate +
                ", attendKind='" + attendKind + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
