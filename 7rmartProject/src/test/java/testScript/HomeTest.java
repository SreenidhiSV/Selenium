package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class HomeTest extends Base {

	@Test(description = "Ensure that dashboard on sidebar is clickable", priority = 1)

	public void isDashboardOnSidebarIsClickable() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		HomePage home = new HomePage(driver);
		home.clickOnDashBoard();
		boolean isRR1Displayed=home.isRR1Displayed();
		Assert.assertTrue(isRR1Displayed,"Dashboard on the sidebar is not clickable");

	}
@Test(description = "User can logout the site", priority = 2)

	public void UserCanLogOutTheSite() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		HomePage home = new HomePage(driver);
		home.clickOnAdmin();
		home.clickOnLogout();
		String actual=driver.getTitle();
		String expectedResult="Login | 7rmart supermarket";
		Assert.assertEquals(actual, expectedResult);

	}
}
