package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement admin;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	private WebElement logout;

	@FindBy(xpath = "//i[@class='nav-icon fas fa-users']")
	private WebElement adminUsers;
	@FindBy(xpath = "( //a[@class='small-box-footer'])[3]")
	private WebElement categoryButton;
	@FindBy(xpath = "//p[text()='Manage News']")
	private WebElement manageNews;
	@FindBy(xpath = "//p[text()='Sub Category']")
	private WebElement subCategory;
	public Admin_UserPage clickOnAdminUsers() {
		adminUsers.click();
		return new Admin_UserPage(driver);
	}
	public CategoryPage clickOnCategory() {
		categoryButton.click();
		return new CategoryPage(driver);
	}
	public Manage_NewsPage clickManageNewsButton() {
		manageNews.click();
		return new Manage_NewsPage(driver);
	}
	public Sub_CategoryPage clickOnSubCategory() {
		subCategory.click();
		return new Sub_CategoryPage(driver);
	}
	public HomePage clickOnAdmin() {////chaining method
		admin.click();
		return this;
	}

	public HomePage clickOnLogout() {//after click logout buttion, no actions in loginpage so that we declare HomePage
		logout.click();
		return this;
	}
	
	public boolean isLogoutButtonDispayed() {
		return logout.isDisplayed();
	}

}