package utiltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseQuick {
	static WebDriver driver;

	public static WebDriver browsertoStart() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		return driver;

	}

}