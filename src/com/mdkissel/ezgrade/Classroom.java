package com.mdkissel.ezgrade;

import com.mdkissel.ezgrade.util.ConsoleHelper;
import com.mdkissel.ezgrade.util.GradeHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classroom {

    public List<Student> students;
    public GradeHelper gh;
    public List<Assignment> assignments;
    public int period;

    private String class_name;


    public Classroom(String name, int period)
    {
        this.students = new ArrayList<Student>();
        this.assignments = new ArrayList<Assignment>();
        this.class_name = name;
        this.period = period;
        gh = new GradeHelper(this);
    }

    public void addStudent(Student student)
    {
        if(students.size() <= 100) {
            students.add(student);
            Collections.sort(students, Comparator.comparing(Student::getFormattedName));

        } else {
            ConsoleHelper.printLog("Not enough memory for classroom over 100 students");
        }
    }

    public void printRoster()
    {
        int i;
        for(i=0; i<this.students.size(); i++){
            if(this.students.get(i) != null){
                ConsoleHelper.printLog(i + ". " + this.students.get(i).getFullName());
            }
        }
    }

    public List<Student> getStudentList()
    {
        return this.students;
    }

    public int getClassSize()
    {
        return this.students.size();
    }

}
