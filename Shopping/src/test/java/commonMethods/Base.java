package commonMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

        //private DesiredCapabilities capabilities = new DesiredCapabilities();
        protected static AndroidDriver androidDriver = null;

        private String appiumPort = "4723";
        private String serverIp = "127.0.0.1";

        @BeforeClass
        public void setup(){
            initDriver();
        }

        public AndroidDriver getDriver() {
            return androidDriver;
        }

        public void initDriver() {
            System.out.println("Inside initDriver method");

    		DesiredCapabilities cap = DesiredCapabilities.android();
    		cap.setCapability("platformName","Android");
    		cap.setCapability("platformVersion", "6.0.1");
    		cap.setCapability("deviceName", "Redmi Note 4");
    		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
    		cap.setCapability("browserName", "");
    		cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
            String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";


            try
            {
                System.out.println("Argument to driver object : " + serverUrl);
                androidDriver = new AndroidDriver(new URL(serverUrl), cap);

            }
            catch (NullPointerException | MalformedURLException ex) {
                throw new RuntimeException("appium driver could not be initialised for device ");
            }
           // System.out.println("Driver in initdriver is : "+androidDriver);
           androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        }

       // @AfterClass
        //public void tearDown(){
         //   androidDriver.quit();
        //}

    }