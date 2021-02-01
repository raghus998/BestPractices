package sys;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fotter {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		
		//All Links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		for (WebElement link : allLinks) 
		{
			System.out.println(link.getText());	
		}
		System.out.println("------------------------------------------------------------------------");
		
		
	
		//Footer links
		WebElement footerdriver = driver.findElement(By.id("footer"));
		List<WebElement> footerlinks = footerdriver.findElements(By.tagName("a"));
		System.out.println(footerlinks.size());
		for (WebElement footerlink : footerlinks) {
			System.out.println(footerlink.getText());
		}
			System.out.println("---------------------------------------------------------------------");
			
				
			
		//Footer frist coloumn
		WebElement footercoloum1 = footerdriver.findElement(By.xpath("//div[@id='footer']/ul/li[1]"));
		List<WebElement> footercoloum1links = footercoloum1.findElements(By.xpath("//div[@id='footer']/ul/li[1]//a"));
		System.out.println(footercoloum1links.size());
		for (WebElement fottercoloum1link : footercoloum1links)
		{
			System.out.println(fottercoloum1link.getText());
			//String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			fottercoloum1link.sendKeys(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(2000);
		}
		System.out.println("---------------------------------------------------------------------");
		
		
		
		//to print title of window
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Title of Tabs : ");
		for (String window : allWindows) {
			System.out.println(driver.switchTo().window(window).getTitle());
		}
		driver.quit();
		

}
}