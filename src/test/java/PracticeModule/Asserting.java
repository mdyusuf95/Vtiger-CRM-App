package PracticeModule;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserting {
	@Test(priority = 0)
	public void testinghardAssert ()
	{ System.out.println("----hard assert -----");
		System.out.println("----line1-----");
		System.out.println("----line2-----");
		System.out.println("----line3-----");
		System.out.println("----line4-----");
		int a=1;
		int e=2;
		assertEquals(a, e);
		System.out.println("----line5-----");
		System.out.println("----line6-----");
		System.out.println("----line7-----");
	}
	@Test
	public void testingSorfAssert ()
	{System.out.println("---soft assert-----");
		System.out.println("----line1-----");
		System.out.println("----line2-----");
		System.out.println("----line3-----");
		System.out.println("----line4-----");
		int a=1;
		int e=1;
		int j=0;
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(a, e);
		System.out.println("----line5-----");
		System.out.println("----line6-----");
		sa.assertAll();
		System.out.println("----line7-----");
		
	}

}
