package seleniumbasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FindElements 
{
	@Test
	public void findRElements()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@id='menu-top']//li"));
		System.out.println("Total no of Elements :"+alloptions.size());
		Iterator<WebElement> option = alloptions.iterator();
		while (option.hasNext())
		{
			WebElement ele = option.next();
			String text = ele.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
