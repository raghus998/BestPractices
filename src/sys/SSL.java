package sys;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.chrome().acceptInsecureCerts();*/
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		
		ChromeDriver driver = new ChromeDriver(c);

}
}