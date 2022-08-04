package com.day16;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAndExam {
    public static void main(String[] args) {
        Exam exam1 = new Exam("John", 90);
        Exam exam2 = new Exam("Mary", 80);
        Exam exam3 = new Exam("Mary", 80);
        // 自建物件給Set集合時,記得要實作equals()與hashCode()方法
        Set<Exam> exams = new LinkedHashSet<>();
        exams.add(exam1);
        exams.add(exam2);
        exams.add(exam3);
        System.out.println(exams);
        System.out.println(exams.size());
        // 請計算平均成績 = ?
        double avg = exams.stream()
                          //.mapToInt(exam -> exam.getScore())
                          .mapToInt(Exam::getScore)
                          .average()
                          .getAsDouble();
        System.out.println(avg);
    }
}
