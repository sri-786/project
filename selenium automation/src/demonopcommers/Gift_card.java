package demonopcommers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Gift_card extends Login{

	public static void main(String[] args) {
		Login s=new Login();
		s.browser();
		s.rg();
		s.Lg();
	
		
		driver.findElement(By.xpath("//*[text()=\"Gift Cards \"]")).click();
		driver.findElement(By.partialLinkText("$100 Physical Gift Card")).click();
		driver.findElement(By.xpath("//*[@id=\"giftcard_45_RecipientName\"]")).sendKeys("RAM");
		driver.findElement(By.xpath("//*[@id=\"giftcard_45_Message\"]")).sendKeys("Tack a gift cards");
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-45\"]")).click();

		Actions act=new Actions(driver);
		WebElement cart1=driver.findElement(By.cssSelector("span.cart-label"));
		act.moveToElement(cart1).perform();
		WebElement go_to_cart1=driver.findElement(By.cssSelector("button.cart-button"));
		act.moveToElement(go_to_cart1).click().perform();

	}

}
