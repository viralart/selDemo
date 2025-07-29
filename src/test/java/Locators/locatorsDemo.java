package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
			driver.manage().window().maximize(); // Maximize the browser window
			driver.findElement(null);
		driver.close(); // Close the browser
	}

}
