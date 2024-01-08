package com.kimbaekjung.semiproject.management.dto;

public class studentNameDTO {
    private String name;

    public studentNameDTO() {
    }

    public studentNameDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
