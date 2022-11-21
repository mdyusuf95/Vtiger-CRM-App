package PracticeModule;

import org.testng.annotations.Test;

import com.vtiger.genriclibrary.Base;

public class class3 extends Base
{
	@Test(groups = "smoke")
	public void Test1()
	{ System.out.println(" smoke3 ");}
	@Test(groups = "regression")
	public void Test2()
	{
		 System.out.println(" regression3");
	}
	@Test(groups = "smoke")
	public void Test3()
	{
		 System.out.println(" smoke 3");
	}
	@Test(groups = "regression")
	public void Test4()
	{
		System.out.println(" regression3");
	}

}
