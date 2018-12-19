package com.mdkissel.ezgrade;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String first_name;
    String last_name;

    public List<Classroom> classrooms;

    public Student(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        classrooms = new ArrayList<Classroom>();
        StudentInit.all_students.add(this);
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
