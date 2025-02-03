package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void handlingAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void handingConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

	public void handlingPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Sreenidhi");
		al.accept();

	}

	public static void main(String[] args) {
		AlertHandling alert = new AlertHandling();
		alert.initializeBrowser();
		// alert.handlingAlerts();
		// alert.handingConfirmAlert();
		alert.handlingPromptAlert();
		alert.driverCloseAndQuit();

	}

}
