package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class CategoryPage {
	public WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy(xpath = "( //a[@class='small-box-footer'])[3]")
	// private WebElement categoryButton;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	private WebElement searchButton;
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement categorySearchField;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement saveSearchButton;

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newButton;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	private WebElement entersearchCategory;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement chooseFile;
	@FindBy(id = "imagePreview")
	private WebElement imagePreview;
	@FindBy(xpath = "//td[text()='Toys']")
	private WebElement searchItem;

	/*
	 * public CategoryPage clickOnCategory() { categoryButton.click(); return new
	 * CategoryPage(driver); }
	 */

	public CategoryPage clickOnSearchButton() {
		searchButton.click();
		return this;
	}

	public CategoryPage clickOnSearchField(String items) {
		categorySearchField.sendKeys(items);
		return this;
	}

	public CategoryPage clickOnSaveSearchButton() {
		saveSearchButton.click();
		return this;
	}

	public CategoryPage clickNewCategory() {// Add new
		newButton.click();
		return this;
	}

	public CategoryPage enterCategoryNameOnCategoryfield(String items) {
		entersearchCategory.sendKeys(items);
		return this;
	}

	public CategoryPage toChooseFile() {
		chooseFile.sendKeys(Constants.IMAGEFILE);
		return this;
	}

	public boolean imagePreviewOfCategory() {
		return imagePreview.isEnabled();
	}

	public boolean isitemDisplayed() {
		return searchItem.isDisplayed();
	}

}
