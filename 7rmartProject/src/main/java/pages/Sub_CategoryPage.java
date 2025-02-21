package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.PageUtility;

public class Sub_CategoryPage {
	public WebDriver driver;

	public Sub_CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath = "//p[text()='Sub Category']")
	// private WebElement subCategory;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	private WebElement searchButton;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	private WebElement selectSubCategory;
	@FindBy(xpath = "//input[@placeholder='Sub Category']")
	private WebElement enterSubCategory;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement search;
	@FindBy(xpath = "//td[text()='Toys']")
	private WebElement searchItem;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newButton;
	@FindBy(xpath = "//select[@name='cat_id']")
	private WebElement enterTheCategory;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement subcategoryField;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement chooseFile;
	@FindBy(xpath = "//div[@id='imagePreview']")
	private WebElement imagePreview;

	PageUtility page = new PageUtility();

	/*
	 * public void clickOnSubCategory() { subCategory.click(); }
	 */

	public Sub_CategoryPage clickOnSearchButton() {
		searchButton.click();
		return this;
	}

	public Sub_CategoryPage enterSubCategoryFromlist(String list1) {
		page.selectDropDownWithVisibleText(selectSubCategory, list1);
		// Select select = new Select(selectSubCategory);
		// select.selectByVisibleText(list1);
		return this;
	}

	public Sub_CategoryPage enterSubCategoryField(String list2) {
		enterSubCategory.sendKeys(list2);
		return this;

	}

	public Sub_CategoryPage searchSubmit() {
		search.click();
		return this;
	}

	public Sub_CategoryPage clickOnNew() {
		newButton.click();
		return this;
	}

	public Sub_CategoryPage enterCategoryFromlist(String value) {
		page.selectDropDownWithVisibleText(enterTheCategory, value);
		// Select select = new Select(enterTheCategory);
		// select.selectByVisibleText(list);
		return this;
	}

	public Sub_CategoryPage enterTheSubCategoryField(String value1) {
		subcategoryField.sendKeys(value1);
		return this;
	}

	public Sub_CategoryPage toChooseFile() {

		chooseFile.sendKeys(Constants.IMAGEFILE1);
		return this;

	}

	public boolean imagePreviewOfCategory() {
		return imagePreview.isEnabled();
	}

	public void selectSearchItem(String items) {
		searchItem.sendKeys(items);
	}

	public boolean isitemDisplayed() {
		return selectSubCategory.isDisplayed();
	}
}
