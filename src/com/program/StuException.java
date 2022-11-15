//Create a user defined Exception namely StuException. Give the details - StudentID, StudentName 
//and StudentPercentage as variables ,take in 5 values for each as follows:
//StudentID - (101,102,103,104,105)
//StudentName -(luke,bobo, sharanya, jose, imitiaz)
//StudentPercentage - (75, 80, 68, 35, 89)
//Throw an user defined exception if the Student Percentage  is less than 40.

package com.program;

import java.util.ArrayList;
import java.util.List;

public class StuException {

	public static void main(String[] args) {

        List<Integer> StudentID = new ArrayList<Integer>(5);
        
        StudentID.add(101);
        StudentID.add(102);
        StudentID.add(103);
        StudentID.add(104);
        StudentID.add(105);
        
        
        List<String> StudentName = new ArrayList<String>(5);
        
        StudentName.add("Luke");
        StudentName.add("Bobo");
        StudentName.add("Sharanya");
        StudentName.add("Jose");
        StudentName.add("Imitiaz");

        List<Integer> StudentPercentage = new ArrayList<Integer>(5);

        StudentPercentage.add(75);
        StudentPercentage.add(80);
        StudentPercentage.add(68);
        StudentPercentage.add(35);
        StudentPercentage.add(89);
        
        try {
        	if (StudentPercentage < 40)
        		
        }
        
		
	}

}
