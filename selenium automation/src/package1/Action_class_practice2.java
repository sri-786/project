package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		
		driver.manage().window().maximize();
		//it can be performed doubleClick() operation
				/*WebElement double_click=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
				Actions act = new Actions(driver); 
				act.doubleClick(double_click).perform();
				//it can be performed rightClick operation
				WebElement right_click=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
				act.contextClick(right_click).perform();
				//it can be performed click() operation
				WebElement click=driver.findElement(By.xpath("//*[text()=\"Click Me\"]"));
				act.click(click).perform();	
				*/
		//it is used to moveToElement perform
		WebElement moiveto1=driver.findElement(By.xpath("//*[text()=\"Main Item 1\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(moiveto1).perform();
		
		Thread.sleep(3000);
		WebElement moiveto2=driver.findElement(By.xpath("//*[text()=\"Main Item 2\"]"));
		act.moveToElement(moiveto2).perform();
		
		WebElement moiveto3=driver.findElement(By.xpath("//*[text()=\"SUB SUB LIST »\"]"));
		act.moveToElement(moiveto3).perform();
		
		WebElement moiveto4=driver.findElement(By.xpath("//*[text()=\"Sub Sub Item 2\"]"));
		act.moveToElement(moiveto4).perform();
		
	
	}

}

