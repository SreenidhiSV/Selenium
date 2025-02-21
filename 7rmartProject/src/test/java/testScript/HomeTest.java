package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	public HomePage homePage;//chaining method
	@Test(description = "To check user can logout the site")
	public void UserCanLogOutTheSite() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage=login.clickOnSigninButton();//chaining method
		homePage.clickOnAdmin().clickOnLogout();
		/*HomePage home = new HomePage(driver);
		home.clickOnAdmin();
		home.clickOnLogout();*/
		String actual = driver.getTitle();
		String expectedResult = Messages.ERRORPAGETITLE;
		Assert.assertEquals(actual, expectedResult);

	}
}
