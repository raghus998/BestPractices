package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BootstrapDD 
{
	@Test
	public void selectDD()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		int c = alloptions.size();
		System.out.println("Titel no of elments are "+c);
		for (WebElement option : alloptions)
		{
			String text = option.getAttribute("innerHTML");
			System.out.println(text);
			if(text.contentEquals("JavaScript"))
			{
				option.click();
				break;
			}
		}
		driver.close();
	}
}