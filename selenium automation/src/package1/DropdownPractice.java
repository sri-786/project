package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		WebElement s=driver.findElement(By.cssSelector("select.col-lg-3[id=\"first\"]"));
		Select d=new Select(s);
		d.selectByIndex(1);
		

		WebElement a=driver.findElement(By.id("animals"));
		Select an=new Select(a);
		an.selectByValue("avatar");
		
		
		Select foods=new Select(driver.findElement(By.cssSelector("select.col-lg-3[id=\"second\"]")));
		foods.selectByVisibleText("Pizza");
		
		foods.selectByIndex(2);
		
		foods.selectByValue("bonda");
		
		//foods.deselectAll();

	}

}
