package javascriptexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollintoview
{
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
	@Test
	public void scrollintoView()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//div[@id='content-3']//p[7]"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		String text = ele.getText();
		System.out.println(text);
		driver.close();
	}
}
