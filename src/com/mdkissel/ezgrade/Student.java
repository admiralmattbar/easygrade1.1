package com.mdkissel.ezgrade;

import com.mdkissel.ezgrade.init.StudentInit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
{

    private String first_name;
    private String last_name;
    private int grade_age;

    public List<Classroom> classrooms;
    public Map<Assignment, Float> map;

    public Student(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.map = new HashMap<Assignment, Float>();
        classrooms = new ArrayList<Classroom>();
        StudentInit.all_students.add(this);
    }

    public Student(String first_name, String last_name, int grade_age)
    {
        this(first_name, last_name);
        this.grade_age = grade_age;
    }

    public void setFirstName(String name)
    {
        first_name = name;
    }

    public String getFirstName()
    {
        return first_name;
    }

    public void setLastName(String name)
    {
        last_name = name;
    }

    public String getLastName()
    {
        return last_name;
    }

    /*
    Returns name first last
     */
    public String getFullName()
    {
        return first_name + " " + last_name;
    }

    /*
    Returns name last, first
     */
    public String getFormattedName()
    {
        return last_name + ", " + first_name;
    }

}
