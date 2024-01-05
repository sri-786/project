package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#:~:text=Copy%20Text-,Double,-click%20on%20button");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//it can be the clear value
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		
		//it can be pass the value
	WebElement element=	driver.findElement(By.xpath("//*[@id=\"field1\"]"));
	act.sendKeys(element,"Srikanth").perform();
		
		//store a value in webElement
		WebElement button = driver.findElement(By.xpath("//*[@ondblclick=\"myFunction1()\"]"));
		
		//it can be perform the doubleClick operation
		act.doubleClick(button).perform();
		
		//storing the values in webElement
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		//it can performs the drag and Drop operation
		act.dragAndDrop(drag, drop).perform();
		

	/*	driver.get("https://demoqa.com/menu");
		
		driver.manage().window().maximize();
		
		//it is used to moveToElement perform
		WebElement moiveto1=driver.findElement(By.xpath("//*[text()=\"Main Item 1\"]"));
		
		act.moveToElement(moiveto1).perform();
		
		
		WebElement moiveto2=driver.findElement(By.xpath("//*[text()=\"Main Item 2\"]"));
		act.moveToElement(moiveto2).perform();
		
		WebElement moiveto3=driver.findElement(By.xpath("//*[text()=\"SUB SUB LIST »\"]"));
		act.moveToElement(moiveto3).perform();
		
		WebElement moiveto4=driver.findElement(By.xpath("//*[text()=\"Sub Sub Item 2\"]"));
		act.moveToElement(moiveto4).perform();
		*/
	
		//keyboard actions
		/*
		driver.get("https://text-compare.com/");
		// create an object for the Actions class and pass the driver argument 
		driver.manage().window().maximize();
	
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
		*/
	
	}

}
