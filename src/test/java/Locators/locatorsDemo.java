package Locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class locatorsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        // Open the URL and maximize the window
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Create a WebDriverWait object with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Login credentials
        String username = "standard_user";
        String password = "secret_sauce";

        // Perform login
        login(driver, wait, username, password);

        // Add product to cart and checkout
        addProductToCart(driver, wait);
        checkout(driver, wait);

        // Close the browser after actions
        driver.quit();
    }

    // Method to perform login
    public static void login(WebDriver driver, WebDriverWait wait, String username, String password) {
        // Wait for the username field to be visible and send username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
        usernameField.sendKeys(username);

        // Wait for the password field to be visible and send password
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));
        passwordField.sendKeys(password);

        // Wait for the login button to be clickable and click it
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();
    }

    // Method to add a product to the cart and proceed to checkout
    public static void addProductToCart(WebDriver driver, WebDriverWait wait) {
        // Wait for the product button to be clickable and click it
        WebElement productButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        productButton.click();

        // Wait for the shopping cart link to be clickable and click it
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link")));
        cartLink.click();

        // Wait for the checkout button to be clickable and click it
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
        checkoutButton.click();
    }

    // Method to fill out checkout form and complete purchase
    public static void checkout(WebDriver driver, WebDriverWait wait) {
        // Wait for first name field to be visible and send data
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        firstNameField.sendKeys("Test");

        // Wait for last name field to be visible and send data
        WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name")));
        lastNameField.sendKeys("Another");

        // Wait for zip code field to be visible and send data
        WebElement zipCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code")));
        zipCodeField.sendKeys("122ABC");

        // Wait for the continue button to be clickable and click it
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='submit']")));
        continueButton.click();

        // Wait for the finish button to be clickable and click it to complete the order
        WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
        finishButton.click();

        // Wait for the back to products button to be clickable and click it
        WebElement backToProductsButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("back-to-products")));
        backToProductsButton.click();
    }
}
