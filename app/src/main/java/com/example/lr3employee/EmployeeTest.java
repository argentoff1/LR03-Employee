package com.example.lr3employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.logic.Employee;

public class EmployeeTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee employee = new Employee("Паринос Максим Александрович",
                "88005553535",
                "Дворник");

        printEmployee(employee);
    }

    private static void printEmployee(Employee emp) {
        System.out.println("ФИО работника: " + emp.getFullName());
        System.out.println("Номер телефона работника: " + emp.getPhoneNumber());
        System.out.println("Должность работника: " + emp.getJobTitle());
    }
}