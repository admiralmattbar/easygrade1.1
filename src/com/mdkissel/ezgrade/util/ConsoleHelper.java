package com.mdkissel.ezgrade.util;

import com.mdkissel.ezgrade.Assignment;
import com.mdkissel.ezgrade.Classroom;
import com.mdkissel.ezgrade.Main;
import com.mdkissel.ezgrade.Student;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConsoleHelper
{

    public static void printLog(String message)
    {

        System.out.println(getTime() + " " + message);
    }

    public static void printGrade(Assignment as, Classroom cl, Student stud)
    {
        String stud_name = stud.getFullName();
        String class_name = cl.getClassName();
        Integer period = cl.getClassPeriod();
        String assignment = as.getAssignmentName();
        printLog(stud_name + " is in " + class_name + " during period " + period.toString() + " working on " + assignment);
    }

    private static String addZerosSecMin(Integer number)
    {
        if(number < 10){
            return "0" + number.toString();
        } else {
            return number.toString();
        }
    }

    private static String addZerosMill(Integer number)
    {
        if(number < 10){
            return "00" + number.toString();
        } else if (number > 10 && number < 100){
            return "0" + number.toString();
        } else {
            return number.toString();
        }
    }

    private static String getTime()
    {
        long end = System.currentTimeMillis();
        int timelapsed = (int)(end - Main.start_time);
        int millis = timelapsed % 1000;
        int seconds = (timelapsed / 1000) % 60;
        int minutes = (timelapsed / 1000) / 60;
        NumberFormat minandsec = new DecimalFormat("#00");
        return "[" + minandsec.format(minutes) + ":" + minandsec.format(seconds) + "." + millis + "]";
    }

}
