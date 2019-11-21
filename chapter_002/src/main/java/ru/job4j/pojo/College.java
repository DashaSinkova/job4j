package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Sinkova Daria Alexeevna");
        student.setDate(new Date());
        student.setGroup("IAS-14");
        System.out.println(student.getFIO() + " study in " + student.getGroup() + " on the " + student.getDate());
    }
}
