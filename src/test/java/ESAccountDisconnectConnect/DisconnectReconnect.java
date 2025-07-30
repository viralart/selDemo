package ESAccountDisconnectConnect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisconnectReconnect {

    public static void main(String[] args) throws InterruptedException {
    	
       // Set the path for the GeckoDriver executable
//       System.setProperty("webdriver.gecko.driver", "C:/Users/viral.maurya/Downloads/geckodriver-v0.36.0-win-aarch64/geckodriver.exe");
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
       By buttonLocator = By.xpath("//span[normalize-space()='Integration']");
       wait.until(ExpectedConditions.elementToBeClickable(buttonLocator)).click();
       By viewButton = By.xpath("//button[normalize-space(text())='View']");

       // Wait until the "View" button is clickable and click it
       WebElement viewbutton = wait.until(ExpectedConditions.elementToBeClickable(viewButton));
       viewbutton.click();
       
       try {
    	   // Wait for the toggle button to be visible and clickable
       WebElement toggleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Disconnect' or normalize-space()='Reconnect']")));
       String buttonText = toggleButton.getText().trim();
       if(buttonText.equalsIgnoreCase("Disconnect")) {
		   // If the button text is "Disconnect", click it
		   By disconnectButton = By.xpath("//button[normalize-space(text())='Disconnect']");
		   WebElement disonnectbutton = wait.until(ExpectedConditions.elementToBeClickable(disconnectButton));
		   disonnectbutton.click();
	   } else {
		   // If the button text is not "Disconnect", click the "Connect" button
		   By connectButton = By.xpath("//button[normalize-space(text())='Reconnect']");
		   WebElement connectbutton = wait.until(ExpectedConditions.elementToBeClickable(connectButton));
		   connectbutton.click();
	   }
	   } catch (Exception e) {
		   System.out.println("Toggle button not found or not clickable: " + e.getMessage());
	   }
       Thread.sleep(5000); // Wait for 10 seconds to ensure the dialog appears
//       
//       // Wait for the confirmation dialog to appear and click the "Yes" button
       driver.quit();
	   // Close the browser//
	   System.out.println("Browser closed successfully.");
       
    }
}