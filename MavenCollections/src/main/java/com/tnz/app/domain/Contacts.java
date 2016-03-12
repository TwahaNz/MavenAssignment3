package com.tnz.app.domain;

import com.tnz.app.Implements.IStudent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 3/12/16.
 */
public class Contacts implements IStudent{

    Map<Integer, Student> contacts;

    public Contacts(){
        contacts = new HashMap<Integer, Student>();
    }

    public Map<Integer, Student> getMap(){
        return contacts;
    }

    public void addItems(Integer studNum, Student stud){
        contacts.put(studNum, stud);
    }

    public String display(Student stud){
        return "\n Name" + contacts.get(stud).getStudName() + "\n Contact" + contacts.get(stud).getStudCon();
    }
    
}
