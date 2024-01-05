package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dorp_Down_without_select_cls {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		

//		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//
//		driver.findElement(By.xpath("//*[@id=\"common-header-region\"]")).click();
//		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]//li"));
//	
//		String s="Kochi";
//		for (WebElement i : ele) {
//			
//			if (i.getText().equals(s)) {
//				i.click();
//				break;
//			}
//		}
		
		//with select tag
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		WebElement selet =driver.findElement(By.id("country-list"));
		Select selectCountryName=new Select(selet);
		selectCountryName.selectByIndex(4);
		
driver.findElement(By.id("state-list")).click();
		
		WebElement selet1 =driver.findElement(By.id("state-list"));
		Select selectStateName=new Select(selet1);
		selectStateName.selectByValue("22");
		
		
//driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		
//		driver.manage().window().maximize();
//		
//		WebElement s=driver.findElement(By.cssSelector("select.col-lg-3[id=\"first\"]"));
//		Select d=new Select(s);
//		d.selectByIndex(1);
//		
//
//		WebElement a=driver.findElement(By.id("animals"));
//		Select an=new Select(a);
//		an.selectByValue("avatar");
//		
//		
//		Select foods=new Select(driver.findElement(By.cssSelector("select.col-lg-3[id=\"second\"]")));
//		foods.selectByVisibleText("Pizza");
//		
//		foods.selectByIndex(2);
//		
//		foods.selectByValue("bonda");
//		
//		//foods.deselectAll();
	}
}
