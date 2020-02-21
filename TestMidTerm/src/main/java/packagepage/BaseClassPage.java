package packagepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassPage {

	WebDriver driver ;
	public BaseClassPage(WebDriver driver){
		this.driver = driver ;
	}
	
	public void WaitOnWebElement(By b) {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(b));
	}
}
