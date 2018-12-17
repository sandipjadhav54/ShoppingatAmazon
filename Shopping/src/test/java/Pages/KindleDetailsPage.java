package Pages;

//import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.PageFactory;

import PageObjects.KindleDetails_Objects;
import commonMethods.Base;

public class KindleDetailsPage extends Base
{
	KindleDetails_Objects kindleDetailsPageObject;
	public KindleDetailsPage()
	{
		super();
		kindleDetailsPageObject = new KindleDetails_Objects();
		PageFactory.initElements(androidDriver, kindleDetailsPageObject);
	}
	
	public String getText_InStock()
	{

		   kindleDetailsPageObject.scroll();
           String getText_InStock = kindleDetailsPageObject.inStock.getText();
           return getText_InStock;
		
	}
}
