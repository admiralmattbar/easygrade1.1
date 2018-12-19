package com.mdkissel.ezgrade;

public class Student {

    String first_name;
    String last_name;

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

    public String getFullName()
    {
        return first_name + " " + last_name;
    }

}
