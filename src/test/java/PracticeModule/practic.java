package PracticeModule;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genriclibrary.Base;


public class practic extends Base
{

	@Test
	public void test1()
	{   
		
		String s=driver.getTitle();
		String e=" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(s, e);
		
	}
}
