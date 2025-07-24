package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LDTest {

    public static void main(String[] args) {
        // Set the correct EdgeDriver path
        System.setProperty("webdriver.edge.driver", "C:\\Users\\viral.maurya\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Set up EdgeOptions
        EdgeOptions options = new EdgeOptions();

        // Initialize EdgeDriver
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();

        // Open the login page (without credentials in the URL)
        driver.get("https://joltfilm.com");

        // Wait for the login elements to be available
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate username and password fields
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Enter username and password
        usernameField.sendKeys("stageguest");
        passwordField.sendKeys("Film24@Jolt");

        // Locate and click the login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[aria-label='GET Started']"));
        loginButton.click();

        // Optionally, check if login was successful (for example, check if you’re redirected to the dashboard)
        wait.until(ExpectedConditions.urlContains("dashboard"));

        // Close the browser
        driver.quit();
    }
}