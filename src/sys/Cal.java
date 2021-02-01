package sys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cal {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		
		while (!driver.findElement(By.cssSelector("[class='monthBlock first'] [class='ui-datepicker-month']")).getText().contains("December")) 
		{
			driver.findElement(By.cssSelector("[class='nextMonth ']")).click();
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'December')]/../../..//a[text()='17']")).click();
}
}	