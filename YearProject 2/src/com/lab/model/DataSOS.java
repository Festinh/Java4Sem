package com.lab.model;

public class DataSOS {
    public static StudentEntity[] createArrayOfPredefinedStudents() {
        return new StudentEntity[]{
                new StudentEntity("Шаповалов", "Георгий", "Михайлович", 2, "Польша", "М", new int[]{5, 5, 5}),
                new StudentEntity("Обломов", "Виктор", "Сергеевич", 4, "Украина", "М", new int[]{2, 5, 1}),
                new StudentEntity("Свидригайлов", "Порфирий", "Павлович", 1, "Украина", "М", new int[]{2, 2, 2}),
                new StudentEntity("Мармеладова", "София", "Григорьевна", 6, "Украина", "Ж", new int[]{5, 5, 5}),
                new StudentEntity("Дюма", "Александр", "Петрофич", 3, "Франция", "М", new int[]{4, 4, 4}),
                new StudentEntity("Павлов", "Станислав", "Николаевич", 2, "Украина", "М", new int[]{5, 3, 2}),
                new StudentEntity("Калинина", "Анна", "Васильевна", 1, "Украина", "Ж", new int[]{1, 3, 2}),
                new StudentEntity("Коперник", "Жанна", "Павловна", 2, "Украина", "Ж", new int[]{3, 2, 3}),
                new StudentEntity("Мёрфи", "Тайлер", "Гейбович", 5, "Украина", "М", new int[]{5, 5, 5}),
                new StudentEntity("Родригез", "Евгений", "Николаевич", 4, "Турция", "М", new int[]{3, 1, 3}),
                new StudentEntity("Лужин", "Пётр", "Никифорович", 4, "Кастовия", "М", new int[]{5, 5, 4}),
                new StudentEntity("Кондратьевна", "Мария", "Романовна", 6, "Украина", "Ж", new int[]{1, 1, 2}),
                new StudentEntity("Дегтярёвна", "Александра", "Владиславовна", 2, "Россия", "Ж", new int[]{5, 5, 5})
        };
    }
}