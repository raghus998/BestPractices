package sys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ksrtc {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.SHIFT+"ban");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("fromPlaceName"))).click().keyUp(Keys.SHIFT).sendKeys("ban").perform();
		for (int i = 0; i <5; i++) 
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		}
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String stmt = " return document.getElementById('fromPlaceName').value";
		String text = (String) js.executeScript(stmt);
		System.out.println(text);
		driver.close();
	}
}
