package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CategoryTest extends Base {
	public HomePage homePage;
	public CategoryPage categoryPage;

	@Test(description = "To check user can search category from category list ", priority = 1)
	public void userCanSearchcategoryFromCategoryList() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String items = ExcelUtility.getStringData(1, 0, "Categories");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		categoryPage = homePage.clickOnCategory();

		// clickOnSearchButton().clickOnSearchField(items).clickOnSaveSearchButton();
		/*
		 * CategoryPage category = new CategoryPage(driver); category.clickOnCategory();
		 * category.clickOnSearchButton(); category.clickOnSearchField(items);
		 * category.clickOnSaveSearchButton();
		 */
		boolean isSearchItemDisplayed = categoryPage.isitemDisplayed();
		assertTrue(isSearchItemDisplayed, Messages.ERRORSEARCHITEM);

	}

	@Test(description = "To check and verify user can choose image", priority = 2)
	public void userCanChooseImage() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String items = ExcelUtility.getStringData(2, 0, "Categories");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		categoryPage = homePage.clickOnCategory();
		categoryPage.clickNewCategory().enterCategoryNameOnCategoryfield(items).toChooseFile();
		/*
		 * CategoryPage category = new CategoryPage(driver); category.clickOnCategory();
		 * category.clickNewCategory();
		 * category.enterCategoryNameOnCategoryfield(items); category.toChooseFile();
		 */
		boolean isImagePreviewEnabled = categoryPage.imagePreviewOfCategory();
		assertTrue(isImagePreviewEnabled, Messages.UPLOADLINGERROR);

	}

}
