package windowhandle;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window name :"+driver.getTitle());
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		driver.findElement(By.xpath("//div[@id='post-body-6170641642826198246']//a[2]")).click();
		driver.findElement(By.xpath(" //div[@id='post-body-6170641642826198246']//a[3]")).click();
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("Total no of Tabes are :"+allWindow.size());
		for (String tab : allWindow) 
		{
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			System.out.println(title);
			if (!title.equalsIgnoreCase("google")) 
			{
				driver.close();
			}
			else if (title.equalsIgnoreCase("Google"))
			{
				driver.findElement(By.name("q")).sendKeys("RS");
				List<WebElement> auto = driver.findElements(By.xpath("//span[contains(text(),'rs')]"));
				System.out.println("Total no of auto sugg's are :"+auto.size());
				System.out.println("All auto sugg's are...... ");
				for (WebElement eachele : auto)
				{
					String text = eachele.getText();
					System.out.println(text);
					if (text.equalsIgnoreCase("rs to dollar")) 
					{
						eachele.click();
						Thread.sleep(5000);
					}
				}
			}
		}
		driver.close();
	}
}
