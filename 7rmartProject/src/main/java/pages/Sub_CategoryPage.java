package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.This;

public class Sub_CategoryPage {
	public WebDriver driver;

	public Sub_CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[text()='Sub Category']")
	private WebElement SubCategory;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement NewButton;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement selectCategory;
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement enterCategory;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement ChooseFile;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchButton;
	@FindBy(xpath = "//select[@id='un']")
	private WebElement selectCategory1;
	@FindBy(xpath = "//input[@placeholder='Sub Category']")
	private WebElement enterSubcategory;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement saveSearchButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement message;

	public void clickOnSubCategory() {
		SubCategory.click();
	}

	public void clickOnNewButton() {
		NewButton.click();
	}

	public void clickOnSelectCategoryFromList() {
		Select select = new Select(selectCategory);
		select.selectByVisibleText("Toys");
	}

	public void enterTheSubCategory() {
		enterCategory.sendKeys("unicone222");
	}

	public void chooseFile() {
		String path = System.getProperty("user.dir");
		ChooseFile.sendKeys(path + "\\src\\test\\resources\\toyyy.jpg");
	}

	
	 public void clickOnSaveButton() {
		 saveButton.click(); 
		 }
	 
	public void clickOnSearch() {
		searchButton.click();
	}

	public void clickOnSelectCategoriesFromList() {
		Select select = new Select(selectCategory1);
		select.selectByVisibleText("Toys");
	}

	public void clickOnSubCategoryField() {
		enterSubcategory.sendKeys("Bunny");
	}

	public void clickOnSearchButton() {
		saveSearchButton.click();
	}

	public boolean isMessageDisplayed() {
		return message.isDisplayed();
	}

}
