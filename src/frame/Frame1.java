package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html");
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='comment-editor']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//textarea[@name='commentBody']")).sendKeys("RS");
		driver.switchTo().defaultContent();
	}
}
