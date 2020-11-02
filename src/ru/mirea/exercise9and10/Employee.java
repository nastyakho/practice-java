package ru.mirea.exercise9and10;

public class Employee {
    private String first_name = "Ivanov";
    private String name = "Ivan";
    private EmployeePosition post;
    private double baseSalary;

    public Employee(EmployeePosition post, double baseSalary) {
        this.post = post;
        this.baseSalary = baseSalary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeePosition getPost() {
        return post;
    }

    public void setPost(EmployeePosition post) {
        this.post = post;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return (int)(post.calcSalary(baseSalary));
    }
}
