package com.tnz.app.domain;

import com.tnz.app.Implements.IStudent;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 3/12/16.
 */
public class Numbers implements IStudent{

    Set<Integer> studNums;

    public Numbers(){
        studNums = new HashSet<Integer>();
    }

    public Set<Integer> getMap(){
        return studNums;
    }

    public void addItems(Student studNum){
         studNums.add(studNum.getStudNum());
    }

    public Set<Integer> getSet(){
        return  studNums;
    }

    public boolean isDouble(Student s){
        return studNums.contains(s.getStudNum());
    }

    public String display(Student stud){
        return "\n Numbers: \n\n" + studNums.toString();
    }
}
