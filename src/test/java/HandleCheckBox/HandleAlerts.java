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
		
		//Normal Alert with OK button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
//		Alert myalert = driver.switchTo().alert();
//		myalert.accept();
		
//		driver.quit();
		//Confirmation Alert with OK and Cancel button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Alert myalert1 = driver.switchTo().alert();
//		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
//		Thread.sleep(2000);
//		myalert1.accept();
//		myalert1.dismiss();
		
		//Prompt Alert with a text box and OK and Cancel button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert2 = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		myalert2.sendKeys("Welcome");
		myalert2.accept();
//		myalert2.dismiss();
		
	}

}
