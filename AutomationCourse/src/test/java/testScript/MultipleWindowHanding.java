package testScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHanding extends Base {
	public void windowHandling() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowhandle = driver.getWindowHandle();
		System.out.println(firstWindowhandle);
		WebElement clickbutton = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickbutton.click();
		Set<String> handleids = driver.getWindowHandles();
		System.out.println(handleids);
		Iterator<String> it = handleids.iterator();
		while (it.hasNext()) {
			String currentid = it.next();
			if (!currentid.equals(firstWindowhandle)) {
				driver.switchTo().window(currentid);
				WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("Sreenidhis98@gmail.com");
				WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
			}
		}

	}

	public static void main(String[] args) {
		MultipleWindowHanding window = new MultipleWindowHanding();
		window.initializeBrowser();
		window.windowHandling();
		window.driverCloseAndQuit();

	}

}
