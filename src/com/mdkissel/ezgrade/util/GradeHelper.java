package com.mdkissel.ezgrade.util;

import com.mdkissel.ezgrade.Assignment;
import com.mdkissel.ezgrade.Classroom;

import java.util.ArrayList;
import java.util.List;


public class GradeHelper
{
    public List<Assignment> assignments;

    public GradeHelper(Classroom classroom)
    {
        assignments = new ArrayList<Assignment>();
    }


}
