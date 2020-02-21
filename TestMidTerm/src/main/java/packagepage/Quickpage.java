package packagepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Quickpage extends BaseClassPage {
	

	public Quickpage(WebDriver driver) {
		super(driver);
	}

	// Library of elements
	@FindBy(how = How.ID, using = "user_login")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.ID, using = "user_pass")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.NAME, using = "wp-submit")
	WebElement SUBMIT_FIELD;
	

	// Methods to interact with the element
	public void enterUsername(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SUBMIT_FIELD.click();

	}

}
