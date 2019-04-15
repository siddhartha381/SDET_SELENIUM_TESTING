import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser {

	public static void main(String[] args) {
		
		//set system propoert
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	
		//Initialize webdriver
		
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		

		//open site
		driver1.get("http://localhost:3000");
		driver2.get("http://localhost:3000");
		
		//managing driver
		driver1.manage().window().maximize();
		driver2.manage().window().maximize();
		
		//close driver
		driver1.close();
		driver2.close();
	}

}
 