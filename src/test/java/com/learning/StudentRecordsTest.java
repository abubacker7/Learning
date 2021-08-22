package com.learning;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Iterator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StudentRecordsTest {

    private StudentRecords studentRecords;
    private Student std1;
    private Student std2;

    @BeforeAll
    void setUp() {
        studentRecords = new StudentRecords();
        std1 = new Student("123", "John", 40, 65);
        std2 = new Student("456", "Vijay", 70, 80);
    }

    @AfterAll
    void tearDown() {
        studentRecords = null;
    }

    @Test
    void getStudentRecords() {
        ArrayList<Student> listOfStudents = studentRecords.getStudentRecords();

        Assertions.assertEquals( std1.getStudentName(), listOfStudents.get(0).getStudentName() );

        Iterator<Student> listOfStudentsIterator = listOfStudents.iterator();

        while ( listOfStudentsIterator.hasNext() ) {
            System.out.println( listOfStudentsIterator.next().getStudentName() );
        }
    }

    @Test
    void addStudentRecord() {
        studentRecords.addStudentRecord( std1 );
        studentRecords.addStudentRecord( std2 );
    }
}