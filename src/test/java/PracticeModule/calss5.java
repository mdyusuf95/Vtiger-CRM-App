package PracticeModule;

import org.testng.annotations.Test;

import com.vtiger.genriclibrary.Base;

public class calss5 extends Base {
	@Test(groups = "smoke")
	public void Test1()
	{ System.out.println(" smoke5");}
	@Test(groups = "regression")
	public void Test2()
	{
		 System.out.println(" regression5");
	}
	@Test(groups = "smoke")
	public void Test3()
	{
		 System.out.println(" smoke 5");
	}
	@Test(groups = "regression")
	public void Test4()
	{
		 System.out.println(" regression5");
	}

}
