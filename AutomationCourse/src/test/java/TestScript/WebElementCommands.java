package TestScript;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base  {
	public void webElementCommand() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");	
		WebElement showmessagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		showmessagefield.sendKeys("sreenidhi");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement showyourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=showyourmessage.getText();
		System.out.println(message);
		showmessagefield.clear();
		String backgroundcolor=showmessagebutton.getCssValue("background-color");
		System.out.println(backgroundcolor);
		int xaxis=showmessagebutton.getLocation().getX();
		System.out.println(xaxis);
		int yaxis=showmessagebutton.getLocation().getY();
		System.out.println(yaxis);
		
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommand=new WebElementCommands();
		webelementcommand.initializeBrowser();
		webelementcommand.webElementCommand();
		//webelementcommand.driverCloseAndQuit();
		

	}

}
