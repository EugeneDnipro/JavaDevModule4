package com.mycompany.app;

public class MaxSalaryWorkerDto {
    private String name;
    private long salary;

    public MaxSalaryWorkerDto(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "MaxSalaryWorkerDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
