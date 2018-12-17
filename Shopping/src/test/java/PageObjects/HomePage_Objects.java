package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import io.appium.java_client.MobileElement;

public class HomePage_Objects 
{
	// Menu
	//@FindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	//public MobileElement menu;
	
	//ShopByCategory
	@FindBy(id = "in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label")
	public WebElement shopByCategory;
	
 
 
}
