package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjects.ShopByCategory_Objects;
import commonMethods.Base;

public class ShopByCategory extends Base
{
	ShopByCategory_Objects shopByCategoryObjects;
	public ShopByCategory()
	{
		super();
		shopByCategoryObjects = new ShopByCategory_Objects();
		PageFactory.initElements(androidDriver, shopByCategoryObjects);
	}
	
	public void clickKindle()
	{
		shopByCategoryObjects.kindle.click();
	}
	
}
