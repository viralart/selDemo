import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.artoonsolutions.com/");
		
		System.out.println("Title of the page is: " + driver.getTitle());
		if(driver.getTitle().equals("Web and Application Development Company - Artoon Solutions")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		driver.close();
	}

}
// This code initializes a ChromeDriver instance for Selenium WebDriver.