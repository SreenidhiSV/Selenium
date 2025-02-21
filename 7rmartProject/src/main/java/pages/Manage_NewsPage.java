package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_NewsPage {
	private WebDriver driver;

	public Manage_NewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath = "//p[text()='Manage News']")
	// private WebElement manageNews;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement clickNewButton;
	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newsField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMessage;

	/*
	 * public Manage_NewsPage clickManageNewsButton() { manageNews.click(); return
	 * this; }
	 */

	public Manage_NewsPage clickNewButton() {
		clickNewButton.click();
		return this;
	}

	public Manage_NewsPage enterNewsOnEnterNewsField(String news1) {
		newsField.sendKeys(news1);
		return this;
	}

	public Manage_NewsPage saveNews() {
		saveButton.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return alertMessage.isDisplayed();

	}

}
