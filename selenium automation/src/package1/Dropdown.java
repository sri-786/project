package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Srikanth");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("srikanth12234@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"reg_email_confirmation__\"]")).sendKeys("srikanth12234@gmail.com");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("srikanth1234");
		
		
		WebElement d=driver.findElement(By.id("day"));
		Select da=new Select(d);
		da.selectByValue("4");
		
		WebElement m=driver.findElement(By.id("month"));
		Select mo=new Select(m);
		mo.selectByValue("3");
		
		WebElement y=driver.findElement(By.id("year"));
		Select ye=new Select(y);
		ye.selectByVisibleText("2000");
		
		driver.findElement(By.cssSelector("input._8esa[value=\"2\"]")).click();
//		driver.findElement(By.xpath("//*[@name=\"websubmit\"]")).click();
		
		
		
		
		

	}

}
