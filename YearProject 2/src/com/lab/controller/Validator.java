package com.lab.controller;

import com.lab.controller.exceptions.WrongYearException;
import com.lab.controller.exceptions.WrongSexException;
import com.lab.controller.exceptions.WrongMarksException;

public class Validator {

    public static void validateYearValue(int year){
        if (year < 1 || year > 6) {
            throw new WrongYearException();
        }
    }

    public static void validateSexValue(String sex){
        if (!sex.equals("М") && !sex.equals("Ж")) {
            throw new WrongSexException();
        }
    }

    public static void validateMarksValue(int[] marks){
        for (int mark: marks) {
            if (mark < 1 || mark > 5) {
                throw new WrongMarksException();
            }
        }
    }
}
