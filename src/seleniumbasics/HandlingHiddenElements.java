package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenElements
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> allradio = driver.findElements(By.xpath("//input[@id='male']"));
		for (int i = 0; i <allradio.size(); i++)
		{
			WebElement radio = allradio.get(i);
			int  x = radio.getLocation().getX();
			if (x!= 0) 
			{
				radio.click();
			}
		}
	}

}
