package com.data.access.object.pattern;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDaoImpl();
        for (Student student : dao.getAllStudents()) {
            System.out.println(student);
        }

        Student student = dao.getAllStudents().get(0);
        student.setName("Michael");
        dao.updateStudent(student);

        Student student1 = dao.getStudent(0);
        System.out.println(student1);
    }
}
