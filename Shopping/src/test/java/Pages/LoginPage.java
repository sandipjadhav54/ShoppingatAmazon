package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import PageObjects.LoginPage_Objects;

import commonMethods.Base;
import commonMethods.DriverFactory;
//import commonMethods.DriverFactory;


public class LoginPage extends Base
{
	LoginPage_Objects loginPageObjects;	
	public LoginPage()
	{
		super();
		loginPageObjects = new LoginPage_Objects();
		PageFactory.initElements(androidDriver, loginPageObjects);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void launchPage() 
	{
		//System.out.println("PASS");

		loginPageObjects.bContinue.click();

	}
}