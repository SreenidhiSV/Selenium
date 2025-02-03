package testScript;

public class BrowserCommands extends Base {

	public void navigationCommand() {
		// 4 navigation commands
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public void browserCommands() { // browser commands method
		String url = driver.getCurrentUrl(); // get url from base
		System.out.println(url);
		String title = driver.getTitle(); // get webpage title
		System.out.println(title);
		String windowhandle = driver.getWindowHandle(); // get window handle id is a webpage(unique) id
		System.out.println(windowhandle);
		String pagesource = driver.getPageSource(); // get source code
		System.out.println(pagesource);

	}

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands(); // object creation
		browsercommands.initializeBrowser();
		// browsercommands.navigationCommand();
		browsercommands.browserCommands(); // call browser command
		// browsercommands.driverCloseAndQuit();

	}

}
