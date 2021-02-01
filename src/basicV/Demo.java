package basicV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/RS/HTMLFiles/WebElementMethods.html");
		Thread.sleep(3000);
		//WebElement fn = driver.findElement(By.id("fn"));
	     //WebElement fn = driver.findElement(By.name("ABC"));  
		//WebElement fn = driver.findElement(By.className("ABCD"));
		WebElement fn = driver.findElement(By.tagName("input"));
		fn.sendKeys("RS");
		
		Thread.sleep(3000);
		//driver.findElement(By.linkText("FaceBook")).click();
		driver.findElement(By.partialLinkText("Inbox")).click();
		
		driver.close();
		
	}

}
