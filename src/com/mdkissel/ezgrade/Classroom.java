package com.mdkissel.ezgrade;

import com.mdkissel.ezgrade.util.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    public List<Student> students;

    public Classroom()
    {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student)
    {
        if(students.size() <= 100) {
            students.add(student);
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
