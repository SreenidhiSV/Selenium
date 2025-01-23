package TestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base {
	public void handlingMouseActions() {
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).build().perform();
	}

	public void handlingMouseHover() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement mouseHover = driver.findElement(By.xpath("//a[Text()='Drag and Drop']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHover).build().perform();

	}

	public void handlingDragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggable = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions = new Actions(driver);
		WebElement droparea = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(draggable, droparea).build().perform();
	}

	public void keyBoardActions() throws AWTException {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {

		ActionsClass actionclass = new ActionsClass();
		actionclass.initializeBrowser();
		// actionclass.handingMouseActions();
		// actionclass.handlingMouseHover();
		actionclass.handlingDragAndDrop();
		try {
			actionclass.keyBoardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actionclass.driverCloseAndQuit();

	}

}
