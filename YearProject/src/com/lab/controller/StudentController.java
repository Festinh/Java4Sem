package com.lab.controller;

import com.lab.model.StudentConverter;
import com.lab.model.StudentModel;
import com.lab.utility.InputUtility;
import com.lab.view.StudentView;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController() {
        model = new StudentModel();
        view = new StudentView();
        InputUtility.setView(view);
    }

    public void addStudent() {
        model.addStudent(InputUtility.inputSurnameValueWithScanner(), InputUtility.inputNameValueWithScanner(), InputUtility.inputPatronymicValueWithScanner(), InputUtility.inputYearValueWithScanner(), InputUtility.inputCountryValueWithScanner(), InputUtility.inputSexValueWithScanner(), InputUtility.inputMarksValueWithScanner());
    }

    public void findStudentByYearAndMarks() {
        view.printArray(StudentConverter.getArrayInString(model.findStudentByYearAndMarks(InputUtility.inputYearValueWithScanner(), InputUtility.inputMarkValueWithScanner())));
    }

    public void findForeignersByMarks() {
        view.printArray(StudentConverter.getArrayInString(model.findForeignersByMarks(InputUtility.inputMarkValueWithScanner())));
    }


    public void runMenu() {
        view.printlnMessage(view.GREETINGS);
        int switchVar;
        while (true) {
            view.printlnMessage(view.MENU_POSSIBILITIES);
            switchVar = InputUtility.inputSwitchValueWithScanner();

            switch (switchVar) {

                case 1:
                    view.printArray(StudentConverter.getArrayInString(model.getStorage()));
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    findStudentByYearAndMarks();
                    break;
                case 4:
                    findForeignersByMarks();
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    view.printlnMessage(StudentView.WRONG_INPUT_DATA);
                    break;
            }
        }
    }

}
