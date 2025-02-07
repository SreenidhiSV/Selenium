package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

import pages.LoginPage;
import pages.Sub_CategoryPage;
import utilities.ExcelUtilities;
import utilities.WaitUtility;

public class Sub_CategoryTest extends Base {
	@Test(description = "User can enter Valid sub category information", priority = 1)

	public void UserCanEntervalidSubCategoryInformation() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		Sub_CategoryPage subcategory = new Sub_CategoryPage(driver);
		subcategory.clickOnSubCategory();
		subcategory.clickOnNewButton();
		subcategory.clickOnSelectCategoryFromList();
		subcategory.enterTheSubCategory();
		subcategory.chooseFile();
		boolean isMessageDisplayed=subcategory.isMessageDisplayed();
		Assert.assertTrue(isMessageDisplayed,"Please select an item in the list");
		

	}
	@Test(description="User can search list sub category ")
	public void userCanSearchlistSubCategory() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		Sub_CategoryPage subcategory = new Sub_CategoryPage(driver);
		subcategory.clickOnSubCategory();
		subcategory.clickOnSearch();
		subcategory.clickOnSelectCategoriesFromList();
		subcategory.clickOnSubCategoryField();
		subcategory.clickOnSearchButton();
		//WaitUtility wait=new WaitUtility();
		//wait.waitUntilTheElementToBeClickable(driver,saveSearchButton);
		//boolean isMessageDisplayed=subcategory.isMessageDisplayed();
		//Assert.assertTrue(isMessageDisplayed,"Result not found");
	}

}
