package com.example.employeemanagement.models;

import java.util.UUID;

public class Employee {
    public Employee(String firstName, String lastName, String fullName, String emailAddress, int hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.id = UUID.randomUUID();
        this.hoursWorked = hoursWorked;
    }

    public Employee() {
    }

    String firstName;
    String lastName;
    String fullName;
    String emailAddress;
    UUID id;
    int hoursWorked;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
