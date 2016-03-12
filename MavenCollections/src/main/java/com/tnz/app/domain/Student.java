package com.tnz.app.domain;


/**
 * Created by Admin on 3/12/16.
 */
public class Student {

    private int studNum;
    private String studName;
    private long studCon;

    public Student(int studNum, String studName, long studCon){
        this.studNum = studNum;
        this.studName = studName;
        this.studCon = studCon;
    }

    public long getStudCon() {
        return studCon;
    }

    public String getStudName() {
        return studName;
    }

    public int getStudNum() {
        return studNum;
    }

    @Override
    public String toString() {
        return " Student Number: " + studNum +
                "\n Student Name: " + studName +
                "\n Student Contact: " + studCon + "\n";
    }
}
