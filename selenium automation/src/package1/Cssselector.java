package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Srikanth");
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Ganjanaboina");
	    driver.findElement(By.cssSelector("input[name=\"reg_email__\"]")).sendKeys("srikanth1423@gmail.com");
	 
	    driver.findElement(By.cssSelector("input[name=\"reg_email_confirmation__\"]")).sendKeys("srikanth1423@gmail.com");
	    driver.findElement(By.cssSelector("input.inputtext[name=\"reg_passwd__\"]")).sendKeys("srikanth123");
        driver.findElement(By.cssSelector("select#day")).sendKeys("8");
	    driver.findElement(By.cssSelector("select[name=\"birthday_month\"]")).sendKeys("Mar");
	    driver.findElement(By.cssSelector("select[name=\"birthday_year\"]")).sendKeys("1999");
    
       driver.findElement(By.cssSelector("input._8esa[value=\"2\"]")).click();
	   driver.findElement(By.cssSelector("button[name=\"websubmit\"]")).click();
	}

}
