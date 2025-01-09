package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Base{	//Uniquely identify  technique
	public void locators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField = driver.findElement(By.id("single-input-field"));	//By is a abstract class & id is locator
		WebElement messageField1 = driver.findElement(By.className("form-control"));
		WebElement showmessagebutton = driver.findElement(By.tagName("button"));
		WebElement showname = driver.findElement(By.name("description"));
		WebElement showlinkText = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement showlinkText1 = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement cssselector=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement xpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showmessagebutton1=driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		driver.findElement(By.xpath("//button[text()='Show Message')]"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one'"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card-body']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancester::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one'//preceding::div[@class='card']"));
	}
	

	public static void main(String[] args) {
		
		Locator locator = new Locator();
		locator.initializeBrowser();
		//locator.driverCloseAndQuit(); 
		

	}

}
