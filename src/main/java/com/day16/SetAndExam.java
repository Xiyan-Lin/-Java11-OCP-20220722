package com.day16;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAndExam {
    public static void main(String[] args) {
        Exam exam1 = new Exam("John", 90);
        Exam exam2 = new Exam("Mary", 80);
        Set<Exam> exams = new LinkedHashSet<>();
        exams.add(exam1);
        exams.add(exam2);
        System.out.println(exams);
    }
}
