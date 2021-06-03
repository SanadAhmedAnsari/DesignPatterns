package com.structural.adapter;

public class School {
    public static void AdapterDemo(){
        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(pen);
        assignmentWork.writeAssignment("I m writing assignment");
    }

}
