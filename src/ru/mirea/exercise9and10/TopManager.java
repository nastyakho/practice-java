package ru.mirea.exercise9and10;

public class TopManager implements EmployeePosition{

    public boolean income;

    public TopManager(boolean income) {
        this.income = income;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (income?(baseSalary*1.5):0);
    }
}
