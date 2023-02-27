package com.mycompany.app;

public class LongestProjectDto {
    private String name;
    private int month_count;

    public LongestProjectDto(String name, int month_count) {
        this.name = name;
        this.month_count = month_count;
    }

    public String getName() {
        return name;
    }

    public int getMonth_count() {
        return month_count;
    }

    @Override
    public String toString() {
        return "LongestProjectDto{" +
                "name='" + name + '\'' +
                ", month_count=" + month_count +
                '}';
    }
}
