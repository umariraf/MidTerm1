package packagepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardQuick extends BaseClassPage {

	public DashBoardQuick(WebDriver driver) {
		super(driver);//calling base class constructor
	}
	// library elements

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Quick Draft")
	WebElement QUICKDRAFT_DISPLAY;
	@FindBy(how = How.ID, using = "title")
	WebElement TITLE_FIELD;
	@FindBy(how = How.ID, using = "content")
	WebElement Content;
	@FindBy(how = How.ID, using = "save-post")
	WebElement SAVEDRAFT_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id='dashboard_quick_press']/descendant::a[contains(text(),'Session MidtermExam')]")
	WebElement TitleAnchor;
	@FindBy(how = How.XPATH , using = "//li[@id='menu-posts']/descendant::div[contains(text(),'Posts')]")
     WebElement POST_MENU;
	@FindBy(how = How.XPATH, using = "//li[@id='menu-posts']/descendant::a[contains(text(),'All Posts')]")
	WebElement ALL_POSTS;
	// METHODS TO INTEREACT WITH ELEMENTS

	public void entertitle(String title) {
		TITLE_FIELD.sendKeys(title);
	}

	public void entercontent(String content) {
		Content.sendKeys(content);
	}

	public void savedraft() {
		SAVEDRAFT_FIELD.click();
	}

	public String GetRecentDraftText() {
		return TitleAnchor.getText();

	}

	public void WaitOnAnchor() {
		By b = By.xpath("//*[@id='dashboard_quick_press']/descendant::a[contains(text(),'Session MidtermExam')]");
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(b));
		WaitOnWebElement(b);
	}

	public void ClickAllPosts() {
		POST_MENU.click();
		ALL_POSTS.click();
	}

}
