package utilities;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public WebDriver driver;
	public void selectDropDownWithValue(WebElement element, String value) {//paramerised indexmethod
		Select object = new Select(element);
		object.selectByValue(value);
		WebElement selectedElement = object.getFirstSelectedOption();
		selectedElement.getText();//print console
	}
	public void selectDropDownWithIndexValue(WebElement element, int index) {
		Select object = new Select(element);
		object.selectByIndex(index);
		WebElement selectedElement = object.getFirstSelectedOption();
		selectedElement.getText();
	}
	public void selectDropDownWithVisibleText(WebElement element,String text) {
		Select object = new Select(element);
		object.selectByVisibleText(text);
		WebElement selectedElement=object.getFirstSelectedOption();
		selectedElement.getText();
	}
	public void handlingMouseOver(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void handlingRightClick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).build().perform();
	}
	public void handingDragAndDrop(WebElement dragable,WebElement dropArea) {
		Actions action=new Actions(driver);
		action.dragAndDrop(dragable, dropArea).build().perform();
	}
	public void javaScriptExecutorScroll(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", element);
	}
	public void javaScriptExecutorClick() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350", "");
	}

}
