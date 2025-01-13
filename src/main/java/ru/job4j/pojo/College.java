package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Popov Ruslan Yurevich");
        student.setGroup("A19");
        student.setAdmission(new Date());

        System.out.println("Student " + student.getFullName() + " study in group "
                + student.getGroup() + " at " + student.getAdmission());
    }
}
