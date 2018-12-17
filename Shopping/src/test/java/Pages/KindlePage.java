package Pages;

import org.openqa.selenium.support.PageFactory;

//import PageObjects.KindlePage_Objects;
import PageObjects.KindlePage_Objects;
import commonMethods.Base;

public class KindlePage extends Base 
{
	KindlePage_Objects kindleObjects;
	public KindlePage()
	{
		super();
		kindleObjects = new KindlePage_Objects();
		PageFactory.initElements(androidDriver, kindleObjects);
	}
	
	public void clickKindleEreader()
	{
		kindleObjects.kindleEreader.click();
	}
}
