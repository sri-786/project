package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Key_bord_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		// create an object for the Actions class and pass the driver argument 
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("hi everyone this is Srikanth");
		
		
		//Control + A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//Control+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//Tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Control+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//Compare both
		WebElement s=driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]"));
		act.moveToElement(s).click().perform();
		
		String s1=driver.findElement(By.xpath("//*[text()=\"The two texts are identical!\"]")).getText();
		System.out.println(s1);
		
		
	}

}
