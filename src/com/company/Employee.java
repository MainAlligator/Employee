package com.company;


import java.util.Optional;

public class Employee {


    private String name;
    private String surname;
    private String position;
    private int id;
    private Department department;


    public Employee(String name, String surname, String position, int id) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.id = id;
    }


    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }


}
