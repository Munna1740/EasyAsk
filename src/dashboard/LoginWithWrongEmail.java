package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithWrongEmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://3.236.8.217/admin/dashboard");
		
		
			
			WebElement email = driver1.findElement(By.name("email"));
			WebElement password = driver1.findElement(By.name("password"));
			
			//set the element input
			email.sendKeys("admin@gmail.com");
			password.sendKeys("superadmin");	
			WebElement login = driver1.findElement(By.className("btn-primary"));
			email.clear();
			password.clear();
			login.click();
	
		

	}

}
