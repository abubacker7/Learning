package com.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

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

        Collections.sort(listOfStudents);

        Iterator<Student> listOfStudentsIterator = listOfStudents.iterator();

        while( listOfStudentsIterator.hasNext() ) {
            System.out.println( listOfStudentsIterator.next().getStudentName() );
        }
    }
}
