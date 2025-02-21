package testScript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.Sub_CategoryPage;
import utilities.ExcelUtility;

public class Sub_CategoryTest extends Base {
	public HomePage homePage;
	public Sub_CategoryPage subcategoryPage;

	@Test(retryAnalyzer = retry.Retry.class, description = "To check user can search SubCategory from search list", priority = 1)
	public void userCanSearchSubCategoryfromSearchList() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String list1 = ExcelUtility.getStringData(1, 0, "SubCategories");
		String list2 = ExcelUtility.getStringData(2, 0, "SubCategories");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		subcategoryPage = homePage.clickOnSubCategory();
		subcategoryPage.clickOnSearchButton().enterSubCategoryFromlist(list1).enterSubCategoryField(list2)
				.searchSubmit();
		/*
		 * Sub_CategoryPage subCategory = new Sub_CategoryPage(driver);
		 * subCategory.clickOnSubCategory(); subCategory.clickOnSearchButton();
		 * subCategory.enterSubCategoryFromlist(list1);
		 * subCategory.enterSubCategoryField(list2); subCategory.searchSubmit();
		 */
		boolean isSearchedItemDisplayed = subcategoryPage.isitemDisplayed();
		Assert.assertTrue(isSearchedItemDisplayed, Messages.ERRORDATADISPLAYED);
	}

	@Test(description = "To check or verify user can enter new Sub_category field", priority = 2)
	public void userCanEnterDatasInNewSub_CategoryField() throws IOException {
		String username1 = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtility.getStringData(1, 1, "LoginPage");
		String value = ExcelUtility.getStringData(1, 1, "SubCategories");
		String value1 = ExcelUtility.getStringData(2, 1, "SubCategories");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username1);
		login.enterPasswordOnPasswordField(password1);
		homePage = login.clickOnSigninButton();
		subcategoryPage = homePage.clickOnSubCategory();
		subcategoryPage.clickOnNew().enterCategoryFromlist(value).enterTheSubCategoryField(value1).toChooseFile();
		/*
		 * Sub_CategoryPage subCategory = new Sub_CategoryPage(driver);
		 * subCategory.clickOnSubCategory(); subCategory.clickOnNew();
		 * subCategory.enterCategoryFromlist(value);
		 * subCategory.enterTheSubCategoryField(value1); subCategory.toChooseFile();
		 */
		boolean isImagePreviewEnabled = subcategoryPage.imagePreviewOfCategory();
		assertTrue(isImagePreviewEnabled, Messages.IMAGEUPLOADINGERROR);
	}
}
