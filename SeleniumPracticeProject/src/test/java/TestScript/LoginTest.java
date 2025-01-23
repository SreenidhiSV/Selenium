package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AutomationCore.Base;

public class LoginTest extends Base {
	@Test(description = "Login using valid credentials")
	public void userLoginWithValidUsernameAndPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));// driver is waiting for login button click
		loginButton.click();

	}

	@Test(description = "Login using invalid credentials")
	public void userLoginWithInvalidUsernameAndPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_userr");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_souce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

	}

	@Test(description = "Login using valid username and valid password")
	public void userLoginWithValidUsernameAndInvalidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("locked_out_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("cecret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

	}
	@Test(description="Login using invalid username and valid password")
	
	public void userLoginWithInvalidUsernameAndValidPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("lockd_out_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("cecret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

		
	}

}
