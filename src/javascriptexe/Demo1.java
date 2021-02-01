package javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Generic;

public class Demo1 
{
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
		@Test
		public void scrollintoView()
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			Generic.highlightElement(driver, email);
			email.sendKeys("ababxbx");
			
	
		}
}
