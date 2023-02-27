package com.mycompany.app;

public class MaxProjectCountClientDto {
    private String name;
    private int projectCount;

    public MaxProjectCountClientDto(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    @Override
    public String toString() {
        return "MaxProjectCountClientDto{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
