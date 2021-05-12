package com.lab.utility;

import com.lab.view.StudentView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {

    private static Scanner sc = new Scanner(System.in);
    private static StudentView view;

    public static void setView(StudentView view) {
        InputUtility.view = view;
    }
    public static int inputSwitchValueWithScanner() {

        view.printMessage(view.INPUT_INT_SWITCH_DATA);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException ex) {
                sc.next();
                view.printlnMessage(view.WRONG_INPUT_DATA + "\n" + view.MENU_POSSIBILITIES + view.INPUT_INT_SWITCH_DATA);
            }
        }
    }

    public static int inputYearValueWithScanner() {
        view.printMessage(view.INPUT_INT_YEAR_DATA);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException ex) {
                view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_YEAR_DATA);
                sc.next();
            }
        }
    }

    public static String inputSurnameValueWithScanner() {
        view.printMessage(view.INPUT_STRING_SURNAME_DATA);
        String surname = sc.nextLine();
        while (surname.equals("")) surname = sc.nextLine();
        return surname;
    }

    public static String inputNameValueWithScanner() {
        view.printMessage(view.INPUT_STRING_NAME_DATA);
        String name = sc.nextLine();
        while (name.equals("")) name = sc.nextLine();
        return name;
    }

    public static String inputPatronymicValueWithScanner() {
        view.printMessage(view.INPUT_STRING_PATRONYMIC_DATA);
        String patronymic = sc.nextLine();
        while (patronymic.equals("")) patronymic = sc.nextLine();
        return patronymic;
    }

    public static String inputCountryValueWithScanner() {
        view.printMessage(view.INPUT_STRING_COUNTRY_DATA);
        String country = sc.nextLine();
        while (country.equals("")) country = sc.nextLine();
        return country;
    }

    public static String inputSexValueWithScanner() {
        view.printMessage(view.INPUT_STRING_SEX_DATA);
        String sex = sc.nextLine();
        while (sex.equals("")) sex = sc.nextLine();
        return sex;
    }


    public static int[] inputMarksValueWithScanner() {
        view.printMessage(view.INPUT_INT_MARKS_DATA);
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    marks[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException ex) {
                    view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_MARK_DATA);
                    sc.next();
                }
            }
        }
        return marks;
    }

    public static int inputMarkValueWithScanner() {
        view.printMessage(view.INPUT_INT_MARK_DATA);
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException ex) {
                view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_MARK_DATA);
                sc.next();
            }
        }
    }
}

