package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement oslo_capital=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement norway_countrie=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		act.dragAndDrop(oslo_capital, norway_countrie).perform();
		
		WebElement stockholm_capital=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement sweden_countrie=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		act.dragAndDrop(stockholm_capital, sweden_countrie).perform();
		
		WebElement washington_capital=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement united_tates_countrie=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		act.dragAndDrop(washington_capital, united_tates_countrie).perform();
		
		WebElement copenhagen_capital=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement denmark_countrie=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		act.dragAndDrop(copenhagen_capital, denmark_countrie).perform();
		
		WebElement seoul_capital=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement southkorea_countrie=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		act.dragAndDrop(seoul_capital, southkorea_countrie).perform();
		
		WebElement rome_capital=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement italy_countrie=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		act.dragAndDrop(rome_capital, italy_countrie).perform();
		
		WebElement madrid_capital=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement spain_countrie=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		act.dragAndDrop(madrid_capital, spain_countrie).perform();
		
		
	}

}
