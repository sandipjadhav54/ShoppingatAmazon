package Pages;

import org.openqa.selenium.support.PageFactory;

import PageObjects.KindelResultsPage_Objects;
import commonMethods.Base;

public class KindleResultsPage extends Base
{
	KindelResultsPage_Objects kindleResultsPageObjects;
	public KindleResultsPage()
	{
		super();
		kindleResultsPageObjects = new KindelResultsPage_Objects();
		PageFactory.initElements(androidDriver, kindleResultsPageObjects);
	}
	
	public void clickFirstOptionOnKindleResultPage()
	{
		kindleResultsPageObjects.kindleResults.click();
	}
}
