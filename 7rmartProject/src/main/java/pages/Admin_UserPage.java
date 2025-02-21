package pages;

import java.security.PrivateKey;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class Admin_UserPage {
	public WebDriver driver;

	public Admin_UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath = "//i[@class='nav-icon fas fa-users']")
	//private WebElement adminUsers;
	@FindBy(xpath = "//p[text()='Manage Users']")
	private WebElement clickManageUsers;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement clickNewButton;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement enterUsername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement enterPassword;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement chooseUsertype;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMessage;
	
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	private WebElement searchButton;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement searchUsernameField;
	@FindBy(xpath = "//select[@id='ut']")
	private WebElement searchUserType;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement saveSearchButton;
	
	PageUtility page = new PageUtility();

	//public void clickOnAdminUsers() {////move to homepage//by chaining method
	//	adminUsers.click();
	//}

	public Admin_UserPage manageUsers() {
		clickManageUsers.click();
		return this;
	}

	public Admin_UserPage newButton() {
		clickNewButton.click();
		return this;
	}

	public Admin_UserPage enterUsernameOnUsernameField(String username2) {
		enterUsername.sendKeys(username2);
		return this;
	}

	public Admin_UserPage enterPasswordOnPasswordField(String password2) {
		enterPassword.sendKeys(password2);
		return this;
	}

	public Admin_UserPage searchUserType(String usertype) {
		page.selectDropDownWithVisibleText(searchUserType, usertype);
		return this;					// Select select = new Select(searchUserType);
										// select.selectByValue(usertype);
		}

	public Admin_UserPage clickOnSaveButton() {
		saveButton.click();
		return this;
	}
	
	public Admin_UserPage clickOnSearchButton() {////search
		searchButton.click();
		return this;
	}

	public Admin_UserPage clickOnSearchUsernameField(String username2) {
		searchUsernameField.sendKeys(username2);
		return this;
	}
	public Admin_UserPage selectUserType(String usertype) {
		page.selectDropDownWithVisibleText(chooseUsertype, usertype);
		return this;					// Select select = new Select(searchUserType);
										// select.selectByValue(usertype);
		}
	

	public Admin_UserPage clickOnSearchValue() {
		saveSearchButton.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return alertMessage.isDisplayed();
	}

}
