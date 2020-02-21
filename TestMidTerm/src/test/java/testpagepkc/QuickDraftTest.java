package testpagepkc;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import packagepage.DashBoardQuick;
import packagepage.PostPage;
import packagepage.Quickpage;
import utiltest.BrowseQuick;

public class QuickDraftTest {

	WebDriver driver;

	@Test

	public void UserShouldBeAbleToLogin() throws InterruptedException {
		driver = BrowseQuick.browsertoStart();

		Quickpage quickpage = PageFactory.initElements(driver, Quickpage.class);
		quickpage.enterUsername("opensourcecms");
		quickpage.enterPassword("opensourcecms");
		quickpage.clickOnSignInButton();

		DashBoardQuick dashboard = PageFactory.initElements(driver, DashBoardQuick.class);
		Random rnd = new Random();
		int rndDraft=rnd.nextInt(999);
		
		String enteredAnchortext = "Session MidtermExam"+rndDraft;
		dashboard.entertitle(enteredAnchortext);
		dashboard.entercontent("validating Given Task on quickdraft");
		dashboard.savedraft();
		
		dashboard.WaitOnAnchor();
		Thread.sleep(3000);
		String actualAnchortext = dashboard.GetRecentDraftText();
		System.out.println( actualAnchortext);
		Assert.assertEquals(actualAnchortext, enteredAnchortext, "This is not your recent draft");
       //Thread.sleep(3000);
       
       dashboard.ClickAllPosts();
       
		PostPage postpage = PageFactory.initElements(driver,PostPage.class);
		postpage.waitonSearchPost();
	    boolean IsTextFound = postpage.IsContentDisplayed(enteredAnchortext);
	    //Assert.assertEquals(actualcontentintable, enteredAnchortext, "not found");
	    
	    Assert.assertTrue(IsTextFound == true, "Text not found");
		
		
        driver.close();
	}

}
