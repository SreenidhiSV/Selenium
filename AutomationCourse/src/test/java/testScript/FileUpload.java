package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUpoadingUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		fileupload.sendKeys("C:\\Users\\Anu\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\notes java.pdf");
		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbutton.click();

	}

	public void fileUploadingUsingRobotClass() throws AWTException {//u can declare multiple declaration
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileupload = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		fileupload.click();
		StringSelection s=new StringSelection("C:\\Users\\Anu\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\notes java.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args)  {
		FileUpload upload = new FileUpload();
		upload.initializeBrowser();
		// upload.fileUpoadingUsingSendKeys();
		try {
			upload.fileUploadingUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		upload.driverCloseAndQuit();

	}

}
