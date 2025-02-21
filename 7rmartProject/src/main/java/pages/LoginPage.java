package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

//add webElement and actions
public class LoginPage {
	public WebDriver driver;
	WaitUtility wait = new WaitUtility();

	public LoginPage(WebDriver driver) {// declare locally and globally
		this.driver = driver;
		PageFactory.initElements(driver, this);// page factory is a class//initialize elements

	}

	@FindBy(xpath = "//input[@placeholder='Username']") // find WebElement using @FindBy
	private WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signinButton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	private WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement alert;

	public LoginPage enterUsernameOnUsernameField(String username1) {//chaining method
		username.sendKeys(username1);
		return this;//indicated by current class
	}

	public LoginPage enterPasswordOnPasswordField(String password1) {//chaining method
		password.sendKeys(password1);
		return this;
	}

	public HomePage clickOnSigninButton() {//indicated by homepage //chaining method
		
		wait.waitUntilTheElementToBeClickable(driver, signinButton);
		signinButton.click();
		return new HomePage(driver);
	}

	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
