package package1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		
//driver.get("https://para.testar.org/parabank/index.htm");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[text()=\"Register\"]")).click();
		
		
		WebDriverWait r=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		r.until(ExpectedConditions.alertIsPresent()).accept();
		
		
		WebDriverWait s=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"populate-text\"]")).click();
		boolean d= s.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"h2\"]"), "Selenium Webdriver"));
		System.out.println(d);
	
		
		
		driver.findElement(By.xpath("//*[@id=\"display-other-button\"]")).click();
		s.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hidden\"]"))).click();
				
		driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		s.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"disable\"]"))).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
		boolean r1=s.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id=\"ch\"]")));
		System.out.println(r1);
		
		
		
		}

}