package com.mdkissel.ezgrade;

import com.mdkissel.ezgrade.init.ClassroomInit;
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
    private int period;

    private String class_name;


    public Classroom(String name, int period)
    {
        this.students = new ArrayList<Student>();
        this.assignments = new ArrayList<Assignment>();
        this.class_name = name;
        this.period = period;
        gh = new GradeHelper(this);
        ClassroomInit.all_classes.add(this);
    }

    public void addStudent(Student student)
    {
        if(this.students.size() <= 100) {
            this.students.add(student);
            Collections.sort(this.students, Comparator.comparing(Student::getFormattedName));
        } else {
            ConsoleHelper.printLog("Not enough memory for classroom over 100 students");
        }
    }

    public void addAssignmentToClass(Assignment as)
    {
        assignments.add(as);
        int i;
        for(i=0; i<this.students.size(); i++){
            if(!this.students.get(i).map.containsKey(as)){
                this.students.get(i).map.put(as, null);
            }
            else
            {
                ConsoleHelper.printLog("Assignment already exists in this classroom.");
            }
        }
    }

    public void gradeClassAssignment(Assignment as, float grade, Student stud)
    {
        if(stud.map.get(as) != null){
            stud.map.put(as, grade);
        }
        else
        {
            ConsoleHelper.printLog("Could not find " + as.getAssignmentName() + " in this classroom. Please create this assignment.");
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

    public String getClassName()
    {
        return class_name;
    }

    public int getClassPeriod()
    {
        return period;
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
