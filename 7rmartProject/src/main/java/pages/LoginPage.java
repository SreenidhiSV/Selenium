package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//add webElement and actions
public class LoginPage {
	public WebDriver driver;

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

	public void enterUsernameOnUsernameField(String username1) {
		username.sendKeys(username1);
	}

	public void enterPasswordOnPasswordField(String password1) {
		password.sendKeys(password1);
	}

	public void clickOnSigninButton() {
		signinButton.click();
	}

	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
