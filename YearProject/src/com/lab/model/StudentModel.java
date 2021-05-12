package com.lab.model;

import java.util.Arrays;

public class StudentModel {

    private StudentStorage storage;

    public StudentModel() {
        storage = new StudentStorage();
    }

    public StudentEntity[] getStorage() {
        return storage.getStorage();
    }

    public void addStudent(String surname, String name, String patronymic, int year, String country, String sex, int[] marks) {
        StudentEntity entity = new StudentEntity();
        entity.setSurname(surname);
        entity.setName(name);
        entity.setPatronymic(patronymic);
        entity.setYear(year);
        entity.setCountry(country);
        entity.setSex(sex);
        entity.setMarks(marks);
        storage.addStudent(entity);
    }

    public StudentEntity[] findStudentByYearAndMarks(int year, int marks) {
        int len = 0;
        boolean mf;
        StudentEntity[] result = new StudentEntity[storage.getLength()];
        for (int i = 0; i < storage.getLength(); i++) {
            if (getStorage()[i].getYear() == year) {
                mf = true;
                for (int mark : getStorage()[i].getMarks()) {
                    if (mark < marks) {
                        mf = false;
                        break;
                    }
                }
                if (mf) {
                    result[len] = getStorage()[i];
                    len++;
                }
            }
        }
        return Arrays.copyOf(result, len);
    }

    public StudentEntity[] findForeignersByMarks(int marks) {
        int len = 0;
        boolean mf;
        StudentEntity[] result = new StudentEntity[storage.getLength()];
        for (int i = 0; i < storage.getLength(); i++) {
            if (!getStorage()[i].getCountry().equals("Украина")) {
                mf = true;
                for (int mark : getStorage()[i].getMarks()) {
                    if (mark < marks) {
                        mf = false;
                        break;
                    }
                }
                if (mf) {
                    result[len] = getStorage()[i];
                    len++;
                }
            }
        }
        return Arrays.copyOf(result, len);
    }
}
