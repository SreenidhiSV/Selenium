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
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement home;
	@FindBy(xpath = "//a[@class='nav-link']")
	private WebElement rR1;
	@FindBy(xpath = "//span[text()='7rmart supermarket']")
	private WebElement title;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement dashboard;

	public void clickOnAdmin() {
		admin.click();
	}

	public void clickOnLogout() {
		logout.click();
	}

	public void clickOnHome() {
		home.click();
	}

	public boolean isLogoutButtonDispayed() {
		return logout.isDisplayed();
	}

	public boolean isRR1Displayed() {
		return rR1.isDisplayed();
	}

	public boolean clickOnDashBoard() {
		return dashboard.isDisplayed();
	}
}