import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendMessages {

	public static void main(String[] args) throws InterruptedException {
		
		
		//set system property
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	
		//Initialize web driver
		 
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		
		
	    driver1.get("http://localhost:3000/");
	    driver2.get("http://localhost:3000/");
	    
	    
	    driver1.findElement(By.id("username")).sendKeys("testuser7");
	    driver2.findElement(By.id("username")).sendKeys("testuser8");
	    
	    driver1.findElement(By.id("login-password")).sendKeys("password");
	    driver2.findElement(By.id("login-password")).sendKeys("password");
	    
	    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]")).click();
	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]")).click();
	    
	    driver1.findElement(By.id("username")).click();
	    driver2.findElement(By.id("username")).click();
	    
	    driver1.findElement(By.id("username")).clear();
	    driver2.findElement(By.id("username")).clear();
	  
	    driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div[2]/div/div/ul/li[3]")).sendKeys("testuser8");
	    driver2.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div[2]/div/div/ul/li[3]")).sendKeys("testuser7");
	    
	    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]")).click();
	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]")).click();
	    
	    driver1.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='vasi'])[1]/following::li[1]")).click();
	    driver2.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='vasi'])[1]/following::li[1]")).click();
	    
	    driver1.findElement(By.id("message")).click();
	    driver1.findElement(By.id("message")).clear();
	    driver1.findElement(By.id("message")).sendKeys("hello");
		
	    driver2.findElement(By.id("message")).click();
	    driver2.findElement(By.id("message")).clear();
	    driver2.findElement(By.id("message")).sendKeys("hello");
	    
	    
	}

}
