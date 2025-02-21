package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.Manage_NewsPage;
import utilities.ExcelUtility;

public class Manage_NewsTest extends Base {
	public HomePage homePage;
	public Manage_NewsPage manageNewsPage;

	@Test(description = "To Check Or Verify User Can Add News")
	public void userCanAddNews() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String news1 = ExcelUtility.getStringData(1, 0, "News");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		manageNewsPage = homePage.clickManageNewsButton();
		manageNewsPage.clickNewButton().enterNewsOnEnterNewsField(news1).saveNews();
		/*
		 * Manage_NewsPage news = new Manage_NewsPage(driver);
		 * news.clickManageNewsButton(); news.clickNewButton();
		 * news.enterNewsOnEnterNewsField(news1); news.saveNews();
		 */
		boolean alertDisplayed = manageNewsPage.isAlertDisplayed();
		Assert.assertTrue(alertDisplayed, Messages.ERRORNEWNEWSADDING);

	}

}
