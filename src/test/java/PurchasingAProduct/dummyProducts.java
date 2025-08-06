package PurchasingAProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummyProducts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
		
		String username = "standard_user";
		String password = "secret_sauce";
		String firstName = "test";
		String lastName = "test";
		String zipCode = "M34D7";
		
		login(driver, username, password);
		addProduct(driver);
		checkOutProduct(driver, firstName, lastName, zipCode);
		System.out.println("Test Case Passed!!!");
		driver.quit();

	}

	private static void checkOutProduct(WebDriver driver, String firstName, String lastName, String zipCode) throws Exception{
		// TODO Auto-generated method stub
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(firstName);
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		driver.findElement(By.id("postal-code")).sendKeys(zipCode);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
//		Thread.sleep(10000);
	}

	public static void addProduct(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.cssSelector("button[id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
//		Thread.sleep(10000);
	}
	public static void login(WebDriver driver, String username, String password) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(10000);
	}
	
}
