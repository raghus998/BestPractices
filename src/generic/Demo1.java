package generic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo1 {
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromTextBox;

	public Demo1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnTextBox()
	{
		fromTextBox.click();
	}
	
	public void entertext() throws InterruptedException
	{
		fromTextBox.sendKeys("Bng");
		Thread.sleep(2000);
		fromTextBox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		fromTextBox.sendKeys(Keys.ENTER);
	}
	
	

}
