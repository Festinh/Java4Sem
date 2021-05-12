package com.lab.model;

public class StudentConverter {
    public static String toString(StudentEntity student){
        return String.format("%-14s%-20s%-18s%-20s%-10s%-12s%-10s%-2s%-2s%-2s%n", student.getStudentCard(), student.getSurname(), student.getName(), student.getPatronymic(), student.getYear(), student.getCountry(), student.getSex(), student.getMarks()[0], student.getMarks()[1], student.getMarks()[2]);
    }
    public static String[] getArrayInString(StudentEntity[] entities){
        String[] res = new String[entities.length];
        for (int i = 0; i < entities.length; i++) {
            res[i] = toString(entities[i]);
        }
        return res;
    }
}
