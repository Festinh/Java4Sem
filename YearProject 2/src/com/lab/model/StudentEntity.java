package com.lab.model;

public class StudentEntity {
    private String surname;
    private String name;
    private String patronymic;
    private int studentCard;
    private int year;
    private String country;
    private String sex;
    private int[] marks;
    private static int amount = 11111111;

    public StudentEntity(String surname, String name, String patronymic, int year, String country, String sex, int[] marks) {
        amount++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.studentCard = amount;
        this.year = year;
        this.country = country;
        this.sex = sex;
        this.marks = marks;
    }

    public StudentEntity() {
        amount++;
        this.studentCard = amount;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(int studentCard) {
        this.studentCard = studentCard;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
