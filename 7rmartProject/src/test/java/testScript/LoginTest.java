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

public class LoginTest extends Base {
	@Test(description = "Login using valid credentials", priority = 1)
	public void userLoginWithValidUsernameAndValidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		boolean signInButtonDisplayed = login.isSignInButtonDislayed();
		login.clickOnSigninButton();
		Assert.assertTrue(signInButtonDisplayed, "Sign in button is not displayed");// assertion

	}

	@Test(description = "Login using valid username and invalid password", priority = 2)
	public void userLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(2, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(2, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		boolean isSignInButtonDislayed = login.isSignInButtonDislayed();
		login.clickOnSigninButton();
		Assert.assertTrue(isSignInButtonDislayed, "Sign in button not displayed");
	}

	@Test(description = "Login Using Invalid username and Valid password", priority = 3)
	public void userLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(3, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(3, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		boolean isSignInButtonDislayed = login.isSignInButtonDislayed();
		login.clickOnSigninButton();
		Assert.assertTrue(isSignInButtonDislayed, "Sign in button not displayed");
	}

	@Test(description = "Login Using Invalid username and Invalid password",priority=4)
	public void userLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String username1 = ExcelUtilities.getStringData(4, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(4, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		boolean isSignInButtonDislayed = login.isSignInButtonDislayed();
		login.clickOnSigninButton();
		Assert.assertTrue(isSignInButtonDislayed, "Sign in button not displayed");

	}

}
