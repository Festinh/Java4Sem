package com.lab.view;

public class StudentView {
    public static final String INPUT_INT_YEAR_DATA = "Enter the year of student = ";
    public static final String WRONG_INPUT_DATA = "Wrong input. Please repeat.";
    public static final String INPUT_STRING_SURNAME_DATA = "Enter surname of the student = ";
    public static final String INPUT_STRING_NAME_DATA = "Enter name of the student = ";
    public static final String INPUT_STRING_PATRONYMIC_DATA = "Enter patronymic of the student = ";
    public static final String INPUT_STRING_COUNTRY_DATA = "Enter country of the student = ";
    public static final String INPUT_STRING_SEX_DATA = "Enter sex of the student (М/Ж) = ";
    public static final String INPUT_INT_MARKS_DATA = "Enter marks of the student (3 numbers) = ";
    public static final String INPUT_INT_MARK_DATA = "Enter mark of the student = ";
    public static final String NO_RESULTS_FOUND = "No results found.";
    public static final String GREETINGS = "Pleasure is mine, user.";
    public static final String INPUT_INT_SWITCH_DATA = "Choose a number. ";
    public static final String MENU_POSSIBILITIES =
                    "\n1 - Show all students\n" +
                    "2 - Add a student\n" +
                    "3 - Search for students by year and marks\n" +
                    "4 - Search for foreign students by marks\n" +
                    "5 - Exit\n";
    public static final String WRONG_YEAR_DATA = "Wrong input. This number cannot be less than 1 and bigger than 6.";
    public static final String WRONG_SEX_DATA = "Wrong input. Please choose either M or Ж";
    public static final String WRONG_MARKS_DATA = "Wrong input. These numbers cannot be less than 1 and bigger than 5.";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printlnMessage(String message) {
        System.out.println(message);
    }

    public void printArray(String[] array) {
        System.out.printf("%-14s%-20s%-18s%-20s%-10s%-12s%-10s%-2s%n", "Id", "Surname", "Name", "Patronymic", "Year", "Country", "Sex", "Marks");
        System.out.println("##############################################################################################################");
        if (array.length > 0)
            for (int i = 0; i < array.length; ++i) {
                printMessage(array[i]);
            }
        else printlnMessage(NO_RESULTS_FOUND);
    }

}
