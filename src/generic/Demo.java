package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static
	{
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        WebElement ele = driver.findElement(By.xpath("//input[@placeholder='From']"));
        ele.sendKeys("ban");
        ele.sendKeys(Keys.ARROW_DOWN);
        ele.sendKeys(Keys.ENTER);
        
        
       
        
 
      

}
}