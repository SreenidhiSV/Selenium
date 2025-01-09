package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
	public void handlingDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		
	}
	

	public static void main(String[] args) {
		DropDown dropdown = new DropDown();
		dropdown.initializeBrowser();
		dropdown.handlingDropDown();
		//dropdown.driverCloseAndQuit();
		
		

	}

}
