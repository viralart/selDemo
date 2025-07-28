package LocatorsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LDTest {

    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("https://easysell.artoon.in/");
       // Maximize the browser window
       driver.manage().window().maximize();
       //Email and password for login
       String email = "kachhiyameet@gmail.com";
       String password = ")l_W}B]qn/N6";
       
       // Locate the email and password fields and enter the credentials
       driver.findElement(By.cssSelector("input[type='text']")).sendKeys(email);
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
       driver.findElement(By.cssSelector("Button[type='submit']")).click(); // Click the login button
       
	   // Wait for the page to load and the sidebar menu to be visible
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       By buttonLocator = By.xpath("//li[@data-sidebar='menu-item']//a[@data-sidebar='menu-button']//span[text()='Integration']");
       wait.until(ExpectedConditions.elementToBeClickable(buttonLocator)).click();
       By viewButton = By.xpath("//button[normalize-space(text())='View']");

       // Wait until the "View" button is clickable and click it
       WebElement viewbutton = wait.until(ExpectedConditions.elementToBeClickable(viewButton));
       viewbutton.click();
       
       // Wait for the "Disconnect" button to be clickable and click it
       By disconnectButton = By.xpath("//button[normalize-space(text())='Disconnect']");
       WebElement disonnectbutton = wait.until(ExpectedConditions.elementToBeClickable(disconnectButton));
       disonnectbutton.click();
       
       
       // Wait for the confirmation dialog to appear and click the "Yes" button
       driver.close();

       
    }
}