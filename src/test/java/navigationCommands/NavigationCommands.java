package navigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
			
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		System.out.println("Current URL after going back: " + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Current URL after going forward: " + driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.quit();
	}

}
