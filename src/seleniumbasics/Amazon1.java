package seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon1
{
	@Test
	public void amazon1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Nokia");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		List<WebElement> PhoneList = driver.findElements(By.xpath("//h2[contains(.,'Nokia')]"));
		Reporter.log("Total no of autoSuggestions :"+PhoneList.size(),true);
		for(WebElement Phone: PhoneList)
		{
			String name = Phone.getText();
			System.out.println(name);
			if(name.equalsIgnoreCase("Nokia 106 (Grey, Dual SIM)"))
			{
				Phone.click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
	}

}
