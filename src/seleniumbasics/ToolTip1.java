package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip1 
{
	@Test
	public void toolTipTest1()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement target = driver.findElement(By.xpath("//a[.='SwitchTo']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();
		List<WebElement> alloptions = driver.findElements(By.xpath("//a[.='SwitchTo']//following::ul[@class='dropdown-menu'][1]/li"));
		System.out.println("Total no of elements Are :"+alloptions.size());
		for (WebElement options : alloptions)
		{
			String text = options.getText();
			System.out.println(text);
			
		}
		driver.close();
	}
}
