package LocatorsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LDTest {

    public static void main(String[] args){
        // Set the correct EdgeDriver path
        System.setProperty("webdriver.edge.driver", "C:\\Users\\viral.maurya\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Set up EdgeOptions if needed
        EdgeOptions options = new EdgeOptions();

        // Set the credentials in the URL format (works for basic authentication)
        String username = "stageguest";
        String password = "Film24@Jolt";
        String url = "https://" + username + ":" + password + "@joltfilm.com";

        // Initialize EdgeDriver with the options
        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();

        // Open the URL with the embedded credentials
        driver.get(url);

    }
}
