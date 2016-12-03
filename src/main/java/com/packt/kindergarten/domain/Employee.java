package com.packt.kindergarten.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by RM on 2016-11-20.
 */
public class Employee {
    private
    String name;
    String surname;
    String employeeID;
    String password;
    String address;
    Date employmentDate;

    public Employee() {

    }

    public Employee(String name, String surname, String id, String password, String address) {
        this.name=name;
        this.surname=surname;
        this.employeeID=id;
        this.password=password;
        this.address=address;
        employmentDate = new Date();
    }
    Boolean isEducator;
    ArrayList<Grade> teachClasses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Boolean getEducator() {
        return isEducator;
    }

    public void setEducator(Boolean educator) {
        isEducator = educator;
    }

    public ArrayList<Grade> getTeachClasses() {
        return teachClasses;
    }

    public void setTeachClasses(ArrayList<Grade> teachClasses) {
        this.teachClasses = teachClasses;
    }
}