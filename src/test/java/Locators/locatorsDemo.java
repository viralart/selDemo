package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize(); // Maximize the browser window
			Thread.sleep(2000); // Wait for 2 seconds to ensure the page loads completely
			
			String username = "standard_user"; // Username for login
			String password = "secret_sauce"; // Password for login
			
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys(username); // Locate the username field and enter the username
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password); // Locate the password field and enter the password
			driver.findElement(By.id("login-button")).click(); // Click the login button
			
			Thread.sleep(5000); // Wait for 2 seconds to ensure the login is processed
			
		driver.close(); // Close the browser
	}

}
