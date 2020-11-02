package ru.mirea.exercise9and10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    int income = 0;
    int o = 0;
    int m = 0;
    int tm = 0;
    int all = 0;
    int baseSalary = 80000;
    ArrayList<Employee> staff = new ArrayList<>();

    public Company()
    {
        System.out.println("Оклад: " + baseSalary + " руб.");
        System.out.println("Наём всех сотрудников");
        hireAll();
        System.out.println("Капитализация компании");
        System.out.println(income);
        System.out.println("Топы зарплат");
        statistics();
        System.out.println("Увольнение 50% сотрудников компании, обновление капитализации компании и зарплат топ менеджеров");
        thanos_pridi_poryadok_navedi();
        System.out.println("Капитализация компании");
        System.out.println(income);
        refreshSalary();
        System.out.println("Обновлённые топы зарплат");
        statistics();
    }

    private void statistics()
    {
        int top = (int)(Math.random()*5) + 10;
        System.out.println("Вывод списка из " + top + " самых высоких зарплат в компании");
        int i = 1;
        for(Employee s : getTopSalaryStaff(top))
        {
            System.out.println("№: " + i + ", " + s.getSalary() + " руб.");
            i++;
        }
        System.out.println("Вывод списка из 30 самых низких зарплат в компании");
        i = 1;
        for(Employee s : getLowestSalaryStaff(30))
        {
            System.out.println("№: " + i + ", " + s.getSalary() + " руб.");
            i++;
        }
    }

    private void hire()
    {
        if (o < 180)
        {
            hireO();
            return;
        }
        if (m < 80)
        {
            hireM();
            return;
        }
        if (tm < 10)
        {
            hireTM();
        }
    }

    private void hireAll()
    {
        while(all < 270)
        {
            hire();
        }
    }

    private void hireO()
    {
        staff.add(new Employee(new Operator(),baseSalary));
        o++;
        all++;
    }

    private void hireM()
    {
        double z = ((Math.random() * 25000) + 115000);
        income += z;
        staff.add(new Employee(new Manager(z),baseSalary));
        m++;
        all++;
    }

    private void hireTM()
    {
        staff.add(new Employee(new TopManager(income > 10000000),baseSalary));
        tm++;
        all++;
    }

    private int getPost(String post)
    {
        for(int sad = 0; sad < staff.size(); sad++)
        {
            if(staff.get(sad).getPost().getJobTitle().equals(post))
            {
                return sad;
            }
        }
        return -1;
    }

    private void refreshSalary()
    {
        for(Employee sd : staff)
        {
            if(sd.getPost().getJobTitle().equals("TopManager"))
            {
                TopManager sg = (TopManager)sd.getPost();
                sg.income = income > 10000000;
                sd.setPost(sg);
            }
        }
    }

    private void fire()
    {
        if (o > 90)
        {
            fireO();
            return;
        }
        if (m > 40)
        {
            fireM();
            return;
        }
        if (tm > 5)
        {
            fireTM();
        }
    }

    private void thanos_pridi_poryadok_navedi()
    {
        while (all > 135)
        {
            fire();
        }
    }

    private void fireO()
    {
        staff.remove(getPost("Operator"));
        o--;
        all--;
    }

    private void fireM()
    {
        Employee sd = staff.get(getPost("Manager"));
        income -= ((Manager)sd.getPost()).bonus;
        staff.remove(sd);
        m--;
        all--;
    }

    private void fireTM()
    {
        staff.remove(getPost("TopManager"));
        tm--;
        all--;
    }

    public static Comparator<Employee> getTop()
    {
        return new Comparator<Employee>(){
            @Override
            public int compare(Employee s1, Employee s2)
            {
                return s2.getSalary() - s1.getSalary();
            }
        };
    }

    public static Comparator<Employee> getLow()
    {
        return new Comparator<Employee>(){
            @Override
            public int compare(Employee s1, Employee s2)
            {
                return s1.getSalary() - s2.getSalary();
            }
        };
    }

    private List<Employee> getTopSalaryStaff(int count)
    {
        Collections.sort(staff, getTop());
        return staff.subList(0, count);
    }

    private List<Employee> getLowestSalaryStaff(int count)
    {
        Collections.sort(staff, getLow());
        return staff.subList(0, count);
    }

    public int getIncome() {
        return income;
    }
}
