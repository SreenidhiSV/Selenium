package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommandswork extends Base {
	public void webelementcommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessagefield = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		showmessagefield.sendKeys("sreenidhi");
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement entervalue1 = driver.findElement(By.xpath("//input[@id='value-a']"));
		entervalue1.sendKeys("4");
		WebElement entervalue2 = driver.findElement(By.xpath("//input[@id='value-b']"));
		entervalue2.sendKeys("5");
		WebElement showmessagebutton2 = driver.findElement(By.xpath("//button[@id='button-two']"));
		showmessagebutton2.click();

	}

	public static void main(String[] args) {

		WebElementCommandswork webelementcommandswork = new WebElementCommandswork();
		webelementcommandswork.initializeBrowser();
		webelementcommandswork.webelementcommands();
		// webelementcommandswork.driverCloseAndQuit();

	}

}
