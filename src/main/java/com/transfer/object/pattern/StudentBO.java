package com.transfer.object.pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<StudentVO>();
        StudentVO s1 = new StudentVO("Robert", 0);
        StudentVO s2 = new StudentVO("Bob", 1);
        students.add(s1);
        students.add(s2);
    }

    public void deleteStudent(StudentVO studentVO) {
        students.remove(studentVO);
        System.out.println("Delete student" + studentVO);
    }

    public List<StudentVO> getStudents(){
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Update student: " + student);
    }
}
