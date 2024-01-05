package demonopcommers;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Apparel extends Login{

	public static void main(String[] args) {
		Login s=new Login();
		s.browser();
		s.rg();
		s.Lg();
		
	
		WebElement app=driver.findElement(By.xpath("//*[text()=\"Apparel \"]"));
		Actions act=new Actions(driver);
		act.moveToElement(app).perform();
		
		WebElement shoes=driver.findElement(By.xpath("//*[text()=\"Shoes \"]"));
		act.moveToElement(shoes).click().perform();
		
		driver.findElement(By.partialLinkText("adidas Consortium Campus 80s Running Shoes")).click();
		
		WebElement sele=driver.findElement(By.xpath("//*[@id=\"product_attribute_9\"]"));
		Select select_size=new Select(sele);
		select_size.selectByValue("22");
		
		driver.findElement(By.xpath("//*[@title=\"Blue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-25\"]")).click();
		
		WebElement app1=driver.findElement(By.xpath("//*[text()=\"Apparel \"]"));
		act.moveToElement(app1).perform();
		
		WebElement clothing=driver.findElement(By.xpath("//*[text()=\"Clothing \"]"));
		act.moveToElement(clothing).click().perform();
		driver.findElement(By.partialLinkText("Levi's 511 Jeans")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-30\"]")).click();
		
		
		
		
		WebElement app2=driver.findElement(By.xpath("//*[text()=\"Apparel \"]"));
		act.moveToElement(app2).perform();
		
		WebElement accessories=driver.findElement(By.xpath("//*[text()=\"Accessories \"]"));
		act.moveToElement(accessories).click().perform();
		
		driver.findElement(By.partialLinkText("Ray Ban Aviator Sunglasses")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-33\"]")).click();
		

		WebElement cart1=driver.findElement(By.cssSelector("span.cart-label"));
		act.moveToElement(cart1).perform();
		WebElement go_to_cart1=driver.findElement(By.cssSelector("button.cart-button"));
		act.moveToElement(go_to_cart1).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
