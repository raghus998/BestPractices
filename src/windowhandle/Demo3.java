package windowhandle;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
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
		Set<String> alltabs = driver.getWindowHandles();
		System.out.println("Total no of tabs is :"+alltabs.size());
		ArrayList<String> al = new ArrayList<String>(alltabs);
		//if we want to switch to a particular tab
		driver.switchTo().window(al.get(1));
		System.out.println("Title of tab is :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(al.get(2));
		System.out.println("Title of tab is :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(al.get(3));
		System.out.println("Title of tab is :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(al.get(0));
		System.out.println("Title of tab is :"+driver.getTitle());
		driver.close();

		
	}
}
