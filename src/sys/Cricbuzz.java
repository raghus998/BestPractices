package sys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	static int sum = 0;
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22859/wi-vs-ind-1st-test-india-tour-of-west-indies-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> runs = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		//System.out.println(runs.size());
		/*for (WebElement run : runs)
		{
			System.out.println(run.getText());
		}*/
		//System.out.println("=============================================");
		String extra = table.findElement(By.xpath("//div[.='Extras']/following::div[1]")).getText();
		String total = table.findElement(By.xpath("//div[.='Total']/following::div[1]")).getText();
		System.out.println("Induisal runs......");
		for (int i = 0; i <runs.size()-2; i++) 
		{
			System.out.println(runs.get(i).getText());	
			String run = runs.get(i).getText();
			int runi = Integer.parseInt(run);
			sum = sum + runi;
		}
		int ex = Integer.parseInt(extra);
		int totalRuns = sum + ex;
		System.out.println("Extra Runs :"+ex);
		System.out.println("Total : "+total);
		System.out.println("Total Runs :"+totalRuns);
		driver.close();
}
}