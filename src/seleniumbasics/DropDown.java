package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown
{
	@Test
	public void selectDDValues()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.stqatools.com/index.php");
		
		WebElement city = driver.findElement(By.xpath("//select[@name='City']"));
		Select sel  = new Select(city);
		WebElement selcted_option = sel.getFirstSelectedOption();
		System.out.println("Before  Selcted options is "+selcted_option.getText());
		sel.selectByIndex(1);
		WebElement selcted_option1 = sel.getFirstSelectedOption();
		System.out.println("After Selcted options is "+selcted_option1.getText());
		//to count and print all options
		List<WebElement> allCity = sel.getOptions();
		int  c = allCity.size();
		//Assert to verify count
		Assert.assertEquals(c,5);
		System.out.println("Total number of cities are "+c);
		for (WebElement singlecity : allCity)
		{
			String city_name = singlecity.getText();
			System.out.println(city_name);
		}
		
		
		
		WebElement course = driver.findElement(By.xpath("//select[@name='Course']"));
		Select sel1 = new Select(course);
		WebElement course_selected = sel1.getFirstSelectedOption();
		System.out.println("Before selected options is "+course_selected.getText());
		sel1.selectByValue("B.Tech");
		WebElement course_selected1 = sel1.getFirstSelectedOption();
		System.out.println("Before selected options is "+course_selected1.getText());
		
		
		
		WebElement district = driver.findElement(By.xpath("//select[@name='District']"));
		Select sel2 = new Select(district);
		sel2.selectByVisibleText("GOA");
	}

}
