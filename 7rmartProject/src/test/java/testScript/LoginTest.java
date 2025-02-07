package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.WaitUtility;

public class LoginTest extends Base {
	// private WebElement signinButton;
	@Test(description = "Login using valid credentials", priority = 1)
	public void userLoginWithValidUsernameAndValidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		boolean isDashboardDisplayed = login.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, "unable to login with given credentials");

	}

	@Test(description = "Login using valid username and invalid password", priority = 2)
	public void userLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(2, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		boolean isAlertDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Successful login with invalid password");
	}

	@Test(description = "Login using invalid username and valid password", priority = 3)
	public void userLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(3, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		boolean isAlertDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Successful login with invalid username");
	}

	@Test(description = "Login using invalid username and invalid password", priority = 4)
	public void userLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(4, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(4, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		// WaitUtility wait=new WaitUtility();
		// wait.waitUntilTheElementToBeClickable(driver, signinButton);
		boolean isAlertDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Successful login with invalid credentials");

	}

}
