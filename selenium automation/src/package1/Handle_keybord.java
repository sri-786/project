package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Handle_keybord {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		for(int i=1;i<=5;i++) {
		
		WebElement context=driver.findElement(By.xpath("//*[text()=\"right click me\"][1]"));
		act.contextClick(context).perform();
		driver.findElement(By.xpath("//*[contains(@class,\"list\")]//li["+i+"]")).click();
		driver.switchTo().alert().accept();
		
		
		
	}
	
	}
}
	