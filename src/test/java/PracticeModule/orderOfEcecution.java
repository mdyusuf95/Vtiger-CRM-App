package PracticeModule;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orderOfEcecution {
	@BeforeSuite
	public void bs()
	{
		System.out.println("--------connect DB--------");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("--------dissconnect DB--------");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("--------BT--------");
	}
	@AfterTest
	public void at()
	{
		System.out.println("--------AT--------");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("----------browser lanching------");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("--------close browser--------");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("----------log in to app------");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("--------log out app--------");
	}
	@Test
	public void Script()
	{
		System.out.println("--------create org-------");
	}
	@Test
	public void Script2()
	{
		System.out.println("--------create accont-------");
	}
	

}
