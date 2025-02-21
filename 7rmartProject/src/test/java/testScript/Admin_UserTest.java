package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.Admin_UserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class Admin_UserTest extends Base {
	public HomePage homePage;
	public Admin_UserPage adminPage;
	@Test(description = "To check and verify admin can add new users",priority = 1)
	public void adminCanAddNewUsers() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String usertype = ExcelUtility.getStringData(1, 2, "Admin_User");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage=login.clickOnSigninButton();
		adminPage=homePage.clickOnAdminUsers();
		FakerUtility faker=new FakerUtility();
		String username2=faker.createRandomUsername();
		String password2=faker.createRandomPassword();
		adminPage.manageUsers().newButton().enterUsernameOnUsernameField(username2)
		.enterPasswordOnPasswordField(password2).selectUserType(usertype).clickOnSaveButton();
		/*Admin_UserPage admin = new Admin_UserPage(driver);
		admin.clickOnAdminUsers();
		admin.manageUsers();
		admin.newButton();
		FakerUtility faker=new FakerUtility();
		String username2=faker.createRandomUsername();
		String password2=faker.createRandomPassword();
		admin.enterUsernameOnUsernameField(username2);
		admin.enterPasswordOnPasswordField(password2);
		admin.selectUserType(usertype);
		admin.clickOnSaveButton();*/
		boolean alertDisplayed = adminPage.isAlertDisplayed();
		Assert.assertTrue(alertDisplayed, Messages.UNABLETOADDNEWUSER);

	}

	@Test(description = "To check and verify admin can search users",priority = 2)
	public void adminCanSearchUsers() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String username2 = ExcelUtility.getStringData(1, 0, "Admin_User");
		String usertype = ExcelUtility.getStringData(1, 2, "Admin_User");
		String url = ExcelUtility.getStringData(1, 3, "Admin_User");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage=login.clickOnSigninButton();
		adminPage=homePage.clickOnAdminUsers().manageUsers().clickOnSearchButton().
		clickOnSearchUsernameField(username2).searchUserType(usertype).clickOnSearchValue();
		/*Admin_UserPage admin = new Admin_UserPage(driver);
		admin.clickOnAdminUsers();
		admin.manageUsers();
		admin.clickOnSearchButton();
		admin.clickOnSearchUsernameField(username2);
		admin.selectUserType(usertype);
		admin.clickOnSearchValue();*/
		String actual = driver.getCurrentUrl();
		String expected = url;
		Assert.assertEquals(actual, expected, Messages.ERRORSEARCHITEMS);
		

	}

}
