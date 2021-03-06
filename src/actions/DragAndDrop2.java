package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		WebElement src = driver.findElement(By.xpath("//span[text()='Thrillers']"));
		WebElement dest = driver.findElement(By.xpath("//span[text()='History']"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(src).pause(2000).moveToElement(dest).release().build().perform();
	}
}
