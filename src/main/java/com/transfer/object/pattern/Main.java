package com.transfer.object.pattern;

public class Main {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        for (StudentVO studentVO : studentBO.getStudents()) {
            System.out.println(studentVO);
        }

        StudentVO s1 = studentBO.getStudents().get(0);
        s1.setName("Michael");
        studentBO.updateStudent(s1);

        System.out.println(studentBO.getStudent(0));
    }
}
