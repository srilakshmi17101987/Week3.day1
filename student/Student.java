package org.student;

import org.department.department;

public class Student extends department  {
	
	public void studentName()
	{
		System.out.println("The studnt name is Priya");
		
	}
	public void studentDept()
	{
		System.out.println("The student belongs to Maths department");
	}
	public void studentId()
	{
		System.out.println("The student ID is TN2334567M");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student sobj=new Student();
sobj.studentName();
sobj.studentDept();
sobj.studentId();
sobj.deptName();
sobj.collegeCode();
sobj.collegeName();
sobj.collegeRank();
	}

}
