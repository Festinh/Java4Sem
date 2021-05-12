package com.lab.model;

import java.util.Arrays;

public class StudentStorage {
    private StudentEntity[] storage = new StudentEntity[100];
    private int length;
    public int getLength() {
        return length;
    }
    public StudentStorage() {
        length = 0;
        addArrayOfStudents(DataSOS.createArrayOfPredefinedStudents());
    }

    public StudentEntity[] getStorage() {
        return Arrays.copyOf(storage, length);
    }

    public void addStudent(StudentEntity x) {
        storage[length] = x;
        length++;
    }

    public void addArrayOfStudents(StudentEntity[] array) {
        for (StudentEntity student: array) {
            addStudent(student);
        }

    }


}