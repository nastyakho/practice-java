package ru.mirea.exercise9and10;

public class Manager implements EmployeePosition{

    public double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (bonus*0.05);
    }
}
