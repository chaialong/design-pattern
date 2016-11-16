package com.data.access.object.pattern;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudemt(Student student);
}
