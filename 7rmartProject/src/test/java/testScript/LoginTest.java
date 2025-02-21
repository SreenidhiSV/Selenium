package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.WaitUtility;

public class LoginTest extends Base {
	public HomePage homePage;// globally declared////chaining method

	@Test(description = "Login using valid credentials", priority = 1, groups = { "smoke" })
	public void userLoginWithValidUsernameAndValidPassword() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();//// chaining method
		boolean isDashboardDisplayed = login.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, Messages.VALIDCREDENTIALSERROR);

	}

	@Test(description = "Login using valid username and invalid password", priority = 2, groups = { "smoke" })
	public void userLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username1 = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		boolean isAlertDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Messages.INVALIDPASSWORDLOGIN);
	}

	@Test(description = "Login using invalid username and valid password", priority = 3)
	public void userLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username1 = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		boolean isAlertDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Messages.INVAIDUSERNAMELOGIN);
	}

	@Test(description = "Login using invalid username and invalid password", priority = 4, dataProvider = "loginProvider")
	public void userLoginWithInvalidUsernameAndInvalidPassword(String username1, String password1) throws IOException {
		// String username1 = ExcelUtility.getStringData(4, 0, "LoginPage");
		// String password1 = ExcelUtility.getStringData(4, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		boolean isAlertDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Messages.INVALIDCREDENTIALSERROR);

	}

	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {
		return new Object[][] {
				// new Object[] {"admin","admin"},
				new Object[] { "admin123", "123" }, // without excel read
				new Object[] { ExcelUtility.getStringData(3, 0, "LoginPage"),
						ExcelUtility.getStringData(2, 1, "LoginPage") } };
	}

}
