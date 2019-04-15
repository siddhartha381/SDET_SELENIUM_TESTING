import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class login {

	public static void main(String[] args) throws InterruptedException {
		
		//set system property
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	
		//Initialize web driver
		 
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		

		//open site
		driver1.get("http://localhost:3000");
		driver2.get("http://localhost:3000");
		driver1.manage().window().maximize();
		driver2.manage().window().maximize();
		
		
		
		//driver1.navigate().back();
		//driver2.navigate().back();
		
		driver1.findElement(By.id("username")).sendKeys("usertest1");
		driver2.findElement(By.id("username")).sendKeys("usertest2");
		
		driver1.findElement(By.id("login-password")).sendKeys("password1");
		driver2.findElement(By.id("login-password")).sendKeys("password2");
		
	
		
		driver1.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div/div/div[1]/div/button")).click();
		driver2.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[2]/div/div/div[1]/div/button")).click();
		
		
		driver1.navigate().forward();
		driver2.navigate().forward();
		
		Thread.sleep(3000);
	}

}
 

