package ru.mirea.exercise9and10;

public class Operator implements EmployeePosition{

    public Operator() {
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
