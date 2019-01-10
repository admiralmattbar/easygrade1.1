package com.mdkissel.ezgrade;

public class Assignment
{
    private String name;
    private float weight = 1.0f;
    private int point_total = 10;
    private Classroom classroom;


    public Assignment(String name, float weight, Classroom classroom, int point_total)
    {
        this.name = name;
        this.weight = weight;
        this.classroom = classroom;
        this.point_total = point_total;
        classroom.assignments.add(this);

    }

    public Assignment(String name)
    {
        this.name = name;
        classroom.addAssignmentToClass(this);
    }

    public String getAssignmentName()
    {
        return name;
    }

    public int getAssignmentPointTotal()
    {
        return point_total;
    }

    public float getAssignmentWeight()
    {
        return weight;
    }

    public Classroom getAssignmentClass()
    {
        return classroom;
    }

    public void setAssignmentName(String name)
    {
        this.name = name;
    }
}
