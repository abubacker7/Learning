package com.learning;

import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private String studentIdNo;
    private String studentName;
    private int englishMark;
    private int tamilMark;

    public Student(String studentIdNo, String studentName, int englishMark, int tamilMark) {
        this.studentIdNo = studentIdNo;
        this.studentName = studentName;
        this.englishMark = englishMark;
        this.tamilMark = tamilMark;
    }

    public String getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(String studentIdNo) {
        this.studentIdNo = studentIdNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    public int getTamilMark() {
        return tamilMark;
    }

    public void setTamilMark(int tamilMark) {
        this.tamilMark = tamilMark;
    }

    public int getTotalMark() {
        return this.englishMark + this.tamilMark;
    }

    @Override
    public int compareTo(Student student) {
        if ( this.getStudentName().compareTo( student.getStudentName() ) > 0 ) {
            return 1;
        } else {
            return -1;
        }
    }
}
