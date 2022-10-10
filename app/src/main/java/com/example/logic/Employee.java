package com.example.logic;

public class Employee {
    private String fullName;
    private String phoneNumber;
    private String jobTitle;

    public Employee(String fullName, String phoneNumber, String jobTitle) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
