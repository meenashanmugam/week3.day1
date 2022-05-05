package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName()
{
	System.out.println("student name is Redhika");
}
public void studentDept()
{
	System.out.println("student department is computerscience");
}
public void studentId()
{
	System.out.println("student Id 3211");
}
public static void main(String args[])
{
	Student s=new Student();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();
	
}
}
