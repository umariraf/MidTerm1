package packagepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.beust.jcommander.internal.Console;

import net.sourceforge.htmlunit.corejs.javascript.debug.DebugFrame;

public class PostPage extends BaseClassPage {

	public PostPage(WebDriver driver){
		super(driver);
	}
//	   @FindBy(how = How.XPATH , using = "//li[@id='menu-posts']/descendant::li[contains(text(),'Posts')]")
//		WebElement POST_MENU;
//
//		@FindBy(how = How.XPATH , using ="//input[@id='cb-select-all-1']")
//		WebElement CHECKBOX;		
	
	@FindBy(how = How.ID , using ="search-submit")
	WebElement SEARCH_POST;
	
	
//    @FindBy(how = How.XPATH , using = "//tbody[@id='the-list']/descendant::tr[@id='post-4']")    
//	WebElement TABLE_CONTENT;
    
	public void waitonSearchPost()
	{
		By b = By.id("search-submit");
		WaitOnWebElement(b);
		
	}

	public boolean IsContentDisplayed(String inputVal )
	{
		By rowTitleBy = By.xpath("//a[contains(@class, 'row-title')]");		
		String textFound = "";
		
		List<WebElement> elems = driver.findElements(rowTitleBy);
		
//		for(int i = 0; i < elems.size(); i++) {
//
//			WebElement e = elems.get(i);
//			textFound = e.getText();
//			
//			if(inputVal.equalsIgnoreCase(textFound))
//				return true;			
//		}
		
		for(WebElement el : elems) {
			textFound = el.getText();
			if(inputVal.equalsIgnoreCase(textFound))
			{
				return true;
			}
		}
		
		return false;		
	}
	

	
}

