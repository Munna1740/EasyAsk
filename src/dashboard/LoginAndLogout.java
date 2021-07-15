package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {

	public static void main(String[] args) {
		//set the driver
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://3.236.8.217/admin/dashboard");
		
		for (int i =0; i<10; i++) {
		//find the elements
		WebElement email = driver1.findElement(By.name("email"));
		WebElement password = driver1.findElement(By.name("password"));
		
		//set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		
		//find the button and click on it
		WebElement login = driver1.findElement(By.className("btn-primary"));
		login.click();
		
		WebElement account = driver1.findElement(By.xpath("//header/ul[2]/li[1]/a[1]"));
		account.click();
		
		WebElement logout = driver1.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/a[2]"));
		logout.click();
		
		}
		
//		//click on navbar
//		WebElement navbar = driver1.findElement(By.className("dropdown-items"));
//		navbar.click();
//		
//		//click on products
//		WebElement products = driver1.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]"));
//		products.click();
	

	}

}
