package com.example.working.with.db;

import com.example.working.with.db.model.MyDataSource;

public class Main {

    public static void main(String[] args) {

        MyDataSource dataSource = new MyDataSource();

        if(!dataSource.open()) {
            System.out.println("Can't open MyDataSource");
            return;
        }

        dataSource.close();
    }
}