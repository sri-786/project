package package2;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//GOTO URL
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File login_src=ts.getScreenshotAs(OutputType.FILE);
//		File login_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\login.png");
//	//	FileUtils.copyFile(login_src, login_trg);

		
//		WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File src=featuredproducts.getScreenshotAs(OutputType.FILE);
//		File trg=new File("C:\\Users\\devi\\eclipse-workspace\\automation\\Screenshots\\featureproducts2.png");
//	//	FileUtils.copyFile(src, trg);
	}

}
