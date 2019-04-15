

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		//set system property
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	
		//Initialize web driver
		 
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		

		//open site
		 driver2.get("http://localhost:3000/");
		    driver2.findElement(By.id("login-password")).clear();
		    driver2.findElement(By.id("login-password")).sendKeys("password");
		    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::button[1]")).click();
		    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[2]/following::input[1]")).click();
		    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[2]/following::input[1]")).clear();
		    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[2]/following::input[1]")).sendKeys("testuser8");
		    driver2.findElement(By.id("reg-password")).clear();
		    driver2.findElement(By.id("reg-password")).sendKeys("password");
		    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[2]/following::button[1]")).click();
		    Thread.sleep(3000);
			
		    
		    driver1.get("http://localhost:3000/");
		    driver1.findElement(By.id("login-password")).clear();
		    driver1.findElement(By.id("login-password")).sendKeys("password");
		    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Login'])[1]/following::button[1]")).click();
		    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[2]/following::input[1]")).click();
		    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[2]/following::input[1]")).clear();
		    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Username'])[2]/following::input[1]")).sendKeys("testuser8");
		    driver1.findElement(By.id("reg-password")).clear();
		    driver1.findElement(By.id("reg-password")).sendKeys("password");
		    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[2]/following::button[1]")).click();
	
		    Thread.sleep(3000);
		
		
		
	}

}
 

