package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjects.Menu_Objects;
import commonMethods.Base;

public class Menu extends Base
{
	Menu_Objects menuObject;
	public Menu()
	{
		super();
		menuObject = new Menu_Objects();
		PageFactory.initElements(androidDriver, menuObject);
	}
	
	public void clickShopByCategory()
	{
		//menuObject.shopByCat.click();
	}
}
