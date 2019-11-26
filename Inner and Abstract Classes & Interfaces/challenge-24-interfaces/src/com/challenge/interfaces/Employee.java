package com.challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Saveable {

    private String name;
    private int customersWasServed;
    private double salary;

    public Employee(String name, int customersWasServed, double salary) {
        this.name = name;
        this.customersWasServed = customersWasServed;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomersWasServed() {
        return customersWasServed;
    }

    public void setCustomersWasServed(int customersWasServed) {
        this.customersWasServed = customersWasServed;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public List<String> saveValues() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, Integer.toString(this.customersWasServed));
        values.add(2, Double.toString(this.salary));
        return values;
    }

    @Override
    public void showValues(List<String> savedValues) {
        if (!savedValues.isEmpty()) {
            for (String savedValue : savedValues) {
                System.out.println(savedValue);
            }
        } else {
            System.out.println("The object has no values");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", customersWasServed=" + customersWasServed +
                ", salary=" + salary +
                '}';
    }
}
