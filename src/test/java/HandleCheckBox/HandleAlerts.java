package HandleCheckBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		Alert myalert = driver.switchTo().alert();
		myalert.accept();
		
//		driver.quit();

	}

}
