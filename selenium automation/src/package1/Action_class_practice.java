package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#:~:text=Copy%20Text-,Double,-click%20on%20button");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//it can be the clear value
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		
		//it can be pass the value
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("Srikanth");
		
		//store a value in webElement
		WebElement button = driver.findElement(By.xpath("//*[@ondblclick=\"myFunction1()\"]"));
		
		//it can be perform the doubleClick operation
		act.doubleClick(button).perform();
		
		//storing the values in webElement
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		//it can performs the drag and Drop operation
		act.dragAndDrop(drag, drop).perform();

	}

}
