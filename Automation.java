package week3.day1;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Automation implements Language,TestTool{
	public void java()
	{
		
		System.out.println("its java language");
	}
	public void selenium()
	{
		System.out.println("its scripting language");
		this.java();
	}
public static void main(String args[])
{


	Automation auto=new Automation();
	auto.java();
  auto.selenium();
}
}
