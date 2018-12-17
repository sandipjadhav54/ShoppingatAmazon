package PageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import commonMethods.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class KindleDetails_Objects extends Base 
{
	public void scroll()
	{
		String selector = "Add Additional Items";
		androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())."
				+ "scrollIntoView(new UiSelector().text(\""+selector+"\"));"));
	}
	
	//Find in/out stock element
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View[9]/android.view.View[21]/android.view.View[1]/android.view.View[1]")
	public WebElement inStock;
}
