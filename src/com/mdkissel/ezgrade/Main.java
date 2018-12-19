package com.mdkissel.ezgrade;

import com.mdkissel.ezgrade.util.ConsoleHelper;

public class Main {

    public static long start_time;

    public static void main(String args[])
    {
        start_time = System.currentTimeMillis();

        ConsoleHelper.printLog("Starting program...");

        Classroom history = new Classroom("History", 4);
        Student maria = new Student("Maria", "Luce");
        history.addStudent(maria);
        Student rammy = new Student("Rammy", "Mina");
        history.addStudent(rammy);
        Student carlos = new Student("Carlos", "Homey");
        history.addStudent(carlos);
        Student allan = new Student("Allan", "Homey");
        history.addStudent(allan);
        System.out.println(history.students.size());

        Assignment test  = new Assignment("Test", 0.2f, history, 10);



        history.printRoster();
    }

}
