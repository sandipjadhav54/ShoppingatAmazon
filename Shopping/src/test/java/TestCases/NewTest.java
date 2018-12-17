package TestCases;


import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.KindleDetailsPage;
//import Pages.Kindle;
import Pages.KindlePage;
import Pages.KindleResultsPage;
import Pages.LoginPage;
//import Pages.Menu;
import Pages.ShopByCategory;
import commonMethods.Base;
//import commonMethods.DriverFactory;

public class NewTest extends Base 
{
	@Test

	public void test() 
	{ 
		//Click on Continue button
		LoginPage loginpage= new LoginPage();
		loginpage.launchPage();
		//Click on Hamburger icon on Home page
		HomePage homepage = new HomePage();
		//homepage.clickHamburger();
		//Click on ShopByCategory
		//Menu menu = new Menu();
		//menu.clickShopByCategory();
		homepage.clickShopByCategory();
		//Click on kindle
		ShopByCategory shopByCategoryPage = new ShopByCategory();
		shopByCategoryPage.clickKindle();
		//click on kindleEreader
		KindlePage kindle = new KindlePage();
		kindle.clickKindleEreader();
		//click on first option in search results list
		KindleResultsPage firstOption = new KindleResultsPage();
		firstOption.clickFirstOptionOnKindleResultPage();
		//Verify availability of item
		KindleDetailsPage kindelDetailsPage = new KindleDetailsPage();
		if(kindelDetailsPage.getText_InStock().equalsIgnoreCase("In stock."))
		{
			System.out.println("Item is in stock");
		}
		else
		{
			System.out.println("Item is out of Stock");
		}
		
	}
}