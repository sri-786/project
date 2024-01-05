package demonopcommers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Electronics extends Login {

	public static void main(String[] args) {
		Login s=new Login();
		s.browser();
		s.rg();
		s.Lg();

	
		WebElement ele=driver.findElement(By.xpath("//*[text()=\"Electronics \"]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		WebElement camera_photo=driver.findElement(By.xpath("//*[text()=\"Camera & photo \"]"));
		act.moveToElement(camera_photo).click().perform();
		driver.findElement(By.partialLinkText("Leica T Mirrorless Digital Camera")).click();
		driver.findElement(By.cssSelector("button.button-1[id=\"add-to-cart-button-16\"]")).click();
		
		WebElement ele1=driver.findElement(By.xpath("//*[text()=\"Electronics \"]"));
		act.moveToElement(ele1).perform();
		
		WebElement cell_phones=driver.findElement(By.xpath("//*[text()=\"Cell phones \"]"));
		act.moveToElement(cell_phones).click().perform();
		
		driver.findElement(By.linkText("Nokia Lumia 1020")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();
		
		WebElement ele2=driver.findElement(By.xpath("//*[text()=\"Electronics \"]"));
		act.moveToElement(ele2).perform();
		
		WebElement others=driver.findElement(By.xpath("//*[text()=\"Others \"]"));
		act.moveToElement(others).click().perform();
		driver.findElement(By.partialLinkText("Beats Pill 2.0 Wireless Speaker")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-21\"]")).click();
		
		WebElement cart1=driver.findElement(By.cssSelector("span.cart-label"));
		act.moveToElement(cart1).perform();
		WebElement go_to_cart1=driver.findElement(By.cssSelector("button.cart-button"));
		act.moveToElement(go_to_cart1).click().perform();
		
		
	}

}
