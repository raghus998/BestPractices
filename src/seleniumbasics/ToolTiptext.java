package seleniumbasics;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToolTiptext
{
	@Test
	public void toolTipTest()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-tooltip-in-selenium.html");
		
		//Find the Howover element
		WebElement traget = driver.findElement(By.xpath("//div[@class='tooltip']"));
		Actions ac = new Actions(driver);
		
		//Move the cursor to element
		ac.moveToElement(traget).perform();
		
		//Find the ToolTip element
		WebElement toolTip = driver.findElement(By.xpath("//span[@class='tooltiptext']"));
		
		//To get the text of the TollTip
		String actualText = toolTip.getText();
		System.out.println("Actual Text :"+actualText);
		
		String expectedText = "Tooltip text";
		
		//To Verify text
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Test Passed");
		
		driver.close();
	}
}
