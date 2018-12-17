package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjects.HomePage_Objects;
import commonMethods.Base;

public class HomePage extends Base 
{
	HomePage_Objects homePageObject;
	public HomePage()
	{
		super();
		homePageObject = new HomePage_Objects();
		PageFactory.initElements(androidDriver, homePageObject);
		
	}
//	public void clickHamburger()
//	{
//		homePageObject.menu.click();
//	}
	
	public void clickShopByCategory()
	{
		homePageObject.shopByCategory.click();
	}
}
