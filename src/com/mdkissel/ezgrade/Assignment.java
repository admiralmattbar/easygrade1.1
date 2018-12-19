package com.mdkissel.ezgrade;

public class Assignment
{
    public String name;
    public float weight;
    public int point_total;
    public Classroom classroom;
    public Student stud;


    public Assignment(String name, float weight, Classroom classroom, int point_total, Student stud)
    {
        this.name = name;
        this.weight = weight;
        this.classroom = classroom;
        this.point_total = point_total;
        this.stud = stud;

        classroom.assignments.add(this);
    }
}
