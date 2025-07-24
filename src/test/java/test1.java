import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.browser", "C:\\Users\\viral.maurya\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new EdgeDriver();
		WebDriver driver2 = new FirefoxDriver();
		
		driver.get("https://www.artoonsolutions.com/");
//		driver1.get("https://www.artoonsolutions.com/");
		driver2.get("https://www.artoonsolutions.com/");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		if(driver.getTitle().equals("Web and Application Development Company - Artoon Solutions")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		driver.close();
//		driver1.close();
		Thread.sleep(5000);
		driver2.close();
	}

}
// This code initializes a ChromeDriver instance for Selenium WebDriver.