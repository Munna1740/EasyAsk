package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSites {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://3.236.8.217/admin/dashboard");
		
		
		//find the elements
		WebElement email = driver1.findElement(By.name("email"));
		WebElement password = driver1.findElement(By.name("password"));
		
		//set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		
		//find the button and click on it
		WebElement login = driver1.findElement(By.className("btn-primary"));
		login.click();
		
		WebElement site = driver1.findElement(By.linkText("Sites"));
		site.click();
		
		WebElement addSite = driver1.findElement(By.className("ladda-label"));
		addSite.click();
		
		for( int i=0; i<3; i++) {
		WebElement site_name = driver1.findElement(By.name("site_name"));
		WebElement site_description = driver1.findElement(By.name("site_description"));
		WebElement site_url = driver1.findElement(By.name("url"));
		
		//set the element input
		site_name.sendKeys("Apple");
		site_description.sendKeys("This is apple website");
		site_url.sendKeys("https://www.apple.com/imac-24/why-mac/");
		
		
		WebElement add_site = driver1.findElement(By.className("dropdown-toggle"));
		add_site.click();
		
		WebElement add_site_new = driver1.findElement(By.linkText("Save and new item"));
		add_site_new.click();
		
		}
		

	}

}
