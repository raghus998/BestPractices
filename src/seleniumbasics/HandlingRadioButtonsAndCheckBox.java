package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtonsAndCheckBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> allRadio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for (int i = 0; i < allRadio.size(); i++)
		{
			WebElement Radio = allRadio.get(i);
			String value = Radio.getAttribute("value");
			boolean display_status = Radio.isDisplayed();
			boolean enabled_status = Radio.isEnabled();
			System.out.println("Value of radio buttons is.............."+value);
			if (display_status) 
			{
				System.out.println(value +"Radio button is displayed");
			}
			if (enabled_status) 
			{
				System.out.println(value +"Radio button is Enabled");
			}
			if (value.equalsIgnoreCase("Ruby")) 
			{
				Radio.click();
			}
			boolean select_status = Radio.isSelected();
			if (select_status) 
			{
				System.out.println(value +"Radio butto is Selected");
			}
		}
		System.out.println("-------------------------------------");
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i < allCheckBox.size(); i++) 
		{
			WebElement checkBox = allCheckBox.get(i);
			String id = checkBox.getAttribute("id");
			System.out.println("Id of the Checkbox is.........."+id);
			if(id.equalsIgnoreCase("sing"))
			{
				checkBox.click();
			}
		}
		driver.close();
	}
	

}
