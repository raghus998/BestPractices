package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapAlert1 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click here to Login')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Raghus");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Raghus");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
	
	}
}
