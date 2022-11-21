package PracticeModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.genriclibrary.ExcelUtility;

public class CreateOrgnisatinTest {
//	@Test(priority = 1)
//	public void newOrgnisation()
//	{
//		System.out.println("newOrgnisation  Succesfuly");
//	}
//	@Test
//	public void CreateOrgnisation()
//	{
//		System.out.println("create Orgnisation  Succesfuly");
//	}
//	@Test
//	public void ModifyOrgnisation()
//	{
//		System.out.println("modify Orgnisation Succesfuly");
//	}
//	@Test(dependsOnMethods = "CreateOrgnisation")
//	public void DeleteOrgnisation()
//	{
//		System.out.println("Delete Orgnisation Succesfuly ");
//	}
//	@Test()
//	public void DraftOrgnisation()
//	{
//		System.out.println("Draft Orgnisation Succesfuly ");
//	}
//	@DataProvider
//	public Object [][] data() 
//	{
//	   Object [][]a=new Object [2][3];
//	   a[0][0]="banglore";
//	   a[0][1]="pune";
//	   a[0][2]=880;
//	   
//	   
//	   a[1][0]="banglore";
//	   a[1][1]="Goa";
//	   a[1][2]=1200;
//	  return a;
//	}
//	
//	@Test(dataProvider = "data")
//	public void datatest(String scr,String drc,int price) throws EncryptedDocumentException, IOException
//	{
//		System.out.println(scr+" "+drc+" "+price);
//	
//	}
	
//	@DataProvider
//public Object[][] ExProvider() throws Exception 
//	{
//	   ExcelUtility ec=new ExcelUtility();
//	   Object[][] b = ec.exeleData("Sheet1");
//	   
//	   return b;
//	}
	//@Test(dataProviderClass = ExcelUtility.class,dataProvider  = "exeleData")
	//@Test(dataProvider = "ExProvider")
//	public void Exeltest(String C1,String C2)
//	{   
//		System.out.println(C1+"    "+C2);
//	}
	@Test(dataProviderClass = ExcelUtility.class,dataProvider  = "exeleData2")
	public void Exeltest(String C1,String C2,String C3)
	{   
		System.out.println(C1+"    "+C2+" "+C3);
	}
}
