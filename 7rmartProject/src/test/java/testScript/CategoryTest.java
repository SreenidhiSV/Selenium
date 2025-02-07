package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class CategoryTest extends Base {
	@Test(description = "User can able to reset category List", priority = 1)
	public void UserCanAbleToResetCategoryList() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		CategoryPage category = new CategoryPage(driver);
		category.clickOnCategory();
		category.clickNewCategory();
		category.enterCategoryNameOnCategoryfield();
		boolean isImagePrebiewEnabled=category.imagePreviewOfCategory();
		category.toChooseFile();
		assertTrue(isImagePrebiewEnabled,"Unable to Choose the File");
		
	}

	@Test(description = "User can Add new category", priority = 2)
	public void UserCanAddNewCategory() throws IOException {
		String username1 = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		login.clickOnSigninButton();
		CategoryPage category = new CategoryPage(driver);
		category.clickOnCategory();
		category.clickNewCategory();
		category.enterCategoryNameOnCategoryfield();
		boolean isImagePreviewEnabled=category.imagePreviewOfCategory();
		category.toChooseFile();
		assertTrue(isImagePreviewEnabled,"Unable to upload new category");
		
		
	}

}
