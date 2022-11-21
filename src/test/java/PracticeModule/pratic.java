package PracticeModule;

import org.testng.annotations.Test;

public class pratic {
	@Test(invocationCount = -1,priority = -2)
	public void T1()
	{
		System.out.println("loogin");
	}
	@Test(dependsOnMethods = "T3",priority = -2)
	public void T2()
	{
		System.out.println("logout");
	}
	@Test(priority = 1,invocationCount = 0)
	public void T3()
	
	{
		System.out.println("loger");
	}

}
