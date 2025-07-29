package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize(); // Maximize the browser window
			Thread.sleep(2000); // Wait for 2 seconds to ensure the page loads completely
		driver.close(); // Close the browser
	}

}
