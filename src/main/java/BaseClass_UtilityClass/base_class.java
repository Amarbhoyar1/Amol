package BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class 
{
     WebDriver driver;
	
     public void initializebrowser() throws InterruptedException
     {
    	 
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Mavenframework\\src\\main\\java\\chrome browser\\chromedriver.exe"); 
    	 driver =new ChromeDriver();
    	 
    	 driver.manage().window().maximize();
    	 
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	 
     Thread.sleep(3000);
     
     
     driver.get("https://kite.zerodha.com/");
     
     }
}
