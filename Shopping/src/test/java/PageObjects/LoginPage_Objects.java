package PageObjects;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import commonMethods.DriverFactory;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import commonMethods.Base;
//import commonMethods.DriverFactory;
//import commonMethods.DriverFactory;

//
//public class LoginPage extends DriverFactory
//{
//	PageObjects loginpage;	
//	public LoginPage()
//	{
//		super();
//		loginpage = new PageObjects();
//		PageFactory.initElements(driver, loginpage);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}
//	public void launchPage() 
//	{
//		//System.out.println("PASS");
//
//		loginpage.bContinue.click();
//
//	}
//}
	public class LoginPage_Objects //extends Base
	{

		@FindBy(id = "in.amazon.mShop.android.shopping:id/sso_continue")
		public WebElement bContinue;
	}
