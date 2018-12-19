package com.mdkissel.ezgrade;

import com.mdkissel.ezgrade.util.ConsoleHelper;

public class Main {

    public static long start_time;

    public static void main(String args[])
    {
        start_time = System.currentTimeMillis();

        ConsoleHelper.printLog("Starting program...");


        Classroom history = new Classroom();
        Student maria = new Student();
        maria.last_name = "Luce";
        maria.first_name = "Maria";
        history.addStudent(maria);
        Student raul = new Student();
        raul.last_name = "Buggy";
        raul.first_name = "Raul";
        history.addStudent(raul);
        Student carlos = new Student();
        carlos.last_name = "Homey";
        carlos.first_name = "Carlos";
        history.addStudent(carlos);
        System.out.println(history.students.size());
        //ConsoleHelper.printLog(history.students[50].getFullName());

        history.printRoster();

    }

}
