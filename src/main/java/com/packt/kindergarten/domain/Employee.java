package com.packt.kindergarten.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by RM on 2016-11-20.
 */
@Entity
@Table(name="employee")
public class Employee {
    private
    String name;
    String surname;
    @Id
    Long idEmployee;
    String password;
    String address;
    Date employmentDate;
    Date birthDate;
    String postalCode;
    String city;
    String street;
    String apartNr;
    String phoneNumber;
    String pesel;
    Date noticeDate;
    boolean isActive;
    String nationality;
    String description;
    String email;
    String role;
    Grade grade;

    public Employee()
    {}

    public Employee(String name, String surname, Long idEmployee, String password, String address, Date employmentDate, Date birthDate, String postalCode, String city, String street, String apartNr, String phoneNumber, String pesel, Date noticeDate, boolean isActive, String nationality, String description, String email, String role, Grade grade) {
        this.name = name;
        this.surname = surname;
        this.idEmployee = idEmployee;
        this.password = password;
        this.address = address;
        this.employmentDate = employmentDate;
        this.birthDate = birthDate;
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.apartNr = apartNr;
        this.phoneNumber = phoneNumber;
        this.pesel = pesel;
        this.noticeDate = noticeDate;
        this.isActive = isActive;
        this.nationality = nationality;
        this.description = description;
        this.email = email;
        this.role = role;
        this.grade = grade;
    }

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

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartNr() {
        return apartNr;
    }

    public void setApartNr(String apartNr) {
        this.apartNr = apartNr;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}