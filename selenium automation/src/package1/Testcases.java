package package1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Testcases {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	
		String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//*[text()=\"Forgotten account?\"]")).sendKeys(clickonlinkTab);
		
		Set<String> handle=driver.getWindowHandles();
		List<String> tab=new ArrayList<>(handle);
		String childHandle=tab.get(1);
		driver.switchTo().window(childHandle);
		
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("9347455676");
		driver.findElement(By.xpath("//*[@id=\"did_submit\"]")).click();
	}

}
