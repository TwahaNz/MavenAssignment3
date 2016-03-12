package com.tnz.app;

import com.sun.rowset.internal.InsertRow;
import com.tnz.app.domain.Contacts;
import com.tnz.app.domain.Numbers;
import com.tnz.app.domain.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 3/12/16.
 */
public class TestStudent {

    private List<Student> students;
    private Contacts contacts;
    private Numbers numbers;

    public TestStudent(){
        students = new ArrayList<Student>();
        contacts = new Contacts();
        numbers = new Numbers();
    }

    @Test
    public void testList(){

        long number = 12345678;
        students.add(new Student(214, "Twaha", number));
        contacts.addItems(students.get(0).getStudNum(), students.get(0));

        Assert.assertEquals("Twaha",students.get(0).getStudName());
    }

    @Test
    public void testMap(){
        students.add(new Student(213, "Twa", 1234567L));

        contacts.addItems(students.get(0).getStudNum(), students.get(0));
        contacts.addItems(students.get(0).getStudNum(), students.get(0));

        Assert.assertEquals(1, contacts.getMap().size());

    }

    @Test
    public void testSet(){

        students.add(new Student(213, "Twa", 1234567L));
        students.add(new Student(213, "Twa", 1234567L));
        students.add(new Student(213, "Twa", 1234567L));

        for (Student s : students)
            numbers.addItems(s);

        Assert.assertTrue(numbers.isDouble(students.get(0)));
    }

}
