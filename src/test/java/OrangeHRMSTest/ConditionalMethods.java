package OrangeHRMSTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {

          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.nopcommerce.com/register");
          driver.manage().window().maximize();
          
          WebElement next = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
          System.out.println("Is the image displayed? " + next);
          
	}

}
