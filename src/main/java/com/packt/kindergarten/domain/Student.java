//package com.packt.kindergarten.domain;
//
//import java.util.Date;
//
///**
// * Created by RM on 2016-11-20.
// */
//public class Student {
//    private
//    String name;
//    String surname;
//    String pesel;
//    Date birthDate;
//    Date startDate;
//    Date endDate;
//    String fatherName;
//    String motherName;
//    String nationality;
//    String description="";
//    Grade grade;
//    boolean isStuding=false;
//
//    public Student() {
//    }
//
//    public Student(String name, String surname, String pesel, Date birthDate, String fatherName, String motherName, String nationality) {
//        this.name = name;
//        this.surname = surname;
//        this.pesel=pesel;
//        this.birthDate = birthDate;
//        this.fatherName = fatherName;
//        this.motherName = motherName;
//        this.nationality = nationality;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getPesel() {
//        return pesel;
//    }
//
//    public void setPesel(String pesel) {
//        this.pesel = pesel;
//    }
//
//    public Date getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }
//
//    public String getFatherName() {
//        return fatherName;
//    }
//
//    public void setFatherName(String fatherName) {
//        this.fatherName = fatherName;
//    }
//
//    public String getMotherName() {
//        return motherName;
//    }
//
//    public void setMotherName(String motherName) {
//        this.motherName = motherName;
//    }
//
//    public String getNationality() {
//        return nationality;
//    }
//
//    public void setNationality(String nationality) {
//        this.nationality = nationality;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description += description;
//    }
//
//    public void changeDescription(String description) {
//        this.description = description;
//    }
//
//    public Grade getGrade() {
//        return grade;
//    }
//
//    public void setGrade(Grade grade) {
//        grade=new Grade();
//        this.grade = grade;
//        //grade.setHasStudent(true);
//    }
//
//    public boolean isIsStuding() {
//        return isStuding;
//    }
//
//    public void setIsStuding(boolean isStuding) {
//        this.isStuding = isStuding;
//    }
//}
