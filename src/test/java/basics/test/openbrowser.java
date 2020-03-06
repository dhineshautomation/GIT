package basics.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class openbrowser {
	
	WebDriver driver;
	@Test
	public void openbrowser() {
		
	    String path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"//Driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Tooltip and Double click")).click();
		
		//doubleclick button
		WebElement ele=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).doubleClick().build().perform();
		
		
		
	}

}
