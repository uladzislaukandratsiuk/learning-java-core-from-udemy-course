package com.challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Saveable {

    private String name;
    private String numberPhone;

    public Customer(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public List<String> saveValues() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, this.numberPhone);
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
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
