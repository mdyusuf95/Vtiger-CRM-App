package OrgnisationModule;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genriclibrary.Base;
import com.vtiger.genriclibrary.ListnerimplimationClass;

import PageObjectRepositry.CreateOrgnizationPage;
import PageObjectRepositry.HomePage;
import PageObjectRepositry.OrgnizationPage;
@Listeners(ListnerimplimationClass.class)

public class CreateOrgnizationTest extends Base{
//	@Test
//	public void createOrgnizationWithOrgName() throws IOException
//	{    
//
//		String Orgnizationname = eLib.getDataFromExcel("Organisation", 1, 1)+jLib.getRanDomNum();
//		//create the orgnization with Orgnization nmae
//		HomePage = new HomePage(driver);
//		HomePage.getOrgnization().click();
//		orgnizationPage=new OrgnizationPage(driver);
//		orgnizationPage.getCreateOrganizationbuton().click();
//		co=new CreateOrgnizationPage(driver);
//		co.SetCreateOrgnization(Orgnizationname);
//		WebElement e= driver.findElement(By.xpath("//span[contains(text(),'Updated' )]"));
//		wLib.waitForElemen(driver,e );
//		driver.navigate().refresh();	
//		HomePage.getOrgnization().click();
//		WebElement a=driver.findElement(By.xpath("//a[.='"+Orgnizationname+"' and @title='Organizations']"));
//		Assert.assertTrue(a.isDisplayed());
//	}
//	@Test
//	public void createOrgWithOrgNameAndIndustry() throws EncryptedDocumentException, IOException
//	{
//		String Orgnizationname = eLib.getDataFromExcel("Organisation", 3, 1)+jLib.getRanDomNum();
//		String industryvalue = eLib.getDataFromExcel("Organisation", 3, 2);
//
//	  //create the orgnization with Orgnization nmae
//	    HomePage = new HomePage(driver);
//	    HomePage.getOrgnization().click();
//	    orgnizationPage=new OrgnizationPage(driver);
//	    orgnizationPage.getCreateOrganizationbuton().click();
//	    co=new CreateOrgnizationPage(driver);
//        co.SetCreateOrgnization(Orgnizationname, industryvalue);
//        WebElement e= driver.findElement(By.xpath("//span[contains(text(),'Updated' )]"));
//		wLib.waitForElemen(driver,e );
//		//driver.navigate().refresh();	
//		HomePage.getOrgnization().click();
//		WebElement a=driver.findElement(By.xpath("//a[.='"+Orgnizationname+"' and @title='Organizations']"));
//		Assert.assertTrue(a.isDisplayed());
//
//	}
	
	@Test
	public void createOrgNameAndIndustryandtype() throws EncryptedDocumentException, IOException
	{
		String Orgnizationname = eLib.getDataFromExcel("Organisation", 5, 1)+jLib.getRanDomNum();
		String industryvalue = eLib.getDataFromExcel("Organisation", 5, 2);
		String Typevalue = eLib.getDataFromExcel("Organisation", 5, 3);
		

	  //create the orgnization with Orgnization nmae
	    HomePage = new HomePage(driver);
	    HomePage.getOrgnization().click();
	    orgnizationPage=new OrgnizationPage(driver);
	    orgnizationPage.getCreateOrganizationbuton().click();
	    co=new CreateOrgnizationPage(driver);
	    
        co.SetCreateOrgnization(Orgnizationname, industryvalue,Typevalue);
        WebElement e= driver.findElement(By.xpath("//span[contains(text(),'Updated' )]"));
		wLib.waitForElemen(driver,e );
		
		//driver.navigate().refresh();	
		HomePage.getOrgnization().click();
		WebElement a=driver.findElement(By.xpath("//a[.='"+Orgnizationname+"' and @title='Organizations']"));
		Assert.assertTrue(a.isDisplayed());

	}



}
