package week3.day1;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;

public class Students {
public void getStudentInfo(int id)
{

System.out.println("Enter student info"+ " "+ id);
}
public void getStudentInfo(int id, String name)
{
System.out.println(" enter students Name and ID"+" " +id+" "+name);
}
public void getStudentInfo(String emailID, long phoneNumber )
{
	System.out.println("enter the sustend emailID and phoneNumber"+" "+emailID+" "+phoneNumber);
}

public static void main(String args[])
{
	Students Std=new Students();
	Std.getStudentInfo(123);
	Std.getStudentInfo(123, "meena");
	Std.getStudentInfo("meenashanmugam05@gmail.com", 9876543291l);
}
}
