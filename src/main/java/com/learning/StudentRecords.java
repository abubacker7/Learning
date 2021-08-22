package com.learning;

import java.util.*;

public class StudentRecords {
    public ArrayList<Student> students;

    public StudentRecords() {
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentRecords() {
        return students;
    }

    public void addStudentRecord( Student student ) {
        students.add(student);
    }

    public static void main(String[] args) {
        Student std1 = new Student("123", "John", 40, 65);
        Student std2 = new Student("456", "Ajay", 70, 80);

        StudentRecords studentRecords = new StudentRecords();
        studentRecords.addStudentRecord( std1 );
        studentRecords.addStudentRecord( std2 );

        ArrayList<Student> listOfStudents = studentRecords.getStudentRecords();

        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if ( o1.getStudentIdNo().compareTo(o2.getStudentIdNo()) > 0 ) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(listOfStudents, studentComparator);
    }
}
