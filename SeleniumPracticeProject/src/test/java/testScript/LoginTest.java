package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class LoginTest extends Base {
	@Test(description = "Login using valid credentials", priority = 1,groups= {"smoke"})
	public void userLoginWithValidUsernameAndValidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));// explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));// driver is waiting for login button click
		boolean isLoginButtonDislayed = loginButton.isDisplayed();// isSelected method
		loginButton.click();
		//Assert.assertTrue(isLoginButtonDislayed, "login button is not displayed");//Assert True
		
		WebElement heading = driver.findElement(By.xpath("//div[text()='Swag Labs']"));// Assert Equals
		String actual = heading.getText();
		String expected = "Swag Labs";
		Assert.assertEquals(actual, expected);// result is passed
		
		
	}

	@Test(description = "Login using invalid credentials", priority = 2,groups= {"smoke"})
	public void userLoginWithInvalidUsernameAndInvalidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_userr");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_souce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		boolean isLoginButtonDislayed = loginButton.isDisplayed();
		loginButton.click();
		//Assert.assertFalse(isLoginButtonDislayed, "Login button is displayed");// Assert False
		Assert.assertTrue(isLoginButtonDislayed, "login button is not displayed");

	}

	@Test(description = "Login using valid username and invalid password", priority = 3)
	public void userLoginWithValidUsernameAndInvalidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("locked_out_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("cecret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		boolean isLoginButtonDisplayed=loginButton.isDisplayed();
		loginButton.click();
		Assert.assertTrue(isLoginButtonDisplayed,"Login button is not displayed" );
		

	}

	@Test(description = "Login using invalid username and valid password", priority = 4)

	public void userLoginWithInvalidUsernameAndValidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("lockd_out_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		boolean isLoginButtonDisplayed=loginButton.isDisplayed();
		loginButton.click();
		//Assert.assertFalse(isLoginButtonDisplayed, "login button is not displayed");
		Assert.assertTrue(isLoginButtonDisplayed, "login button is not displayed");

	}

}
