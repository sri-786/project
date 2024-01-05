package demonopcommers;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Computers extends Login{

//	public static WebDriver driver;

	public static void main(String[] args) {

		Login s=new Login();
		s.browser();
		s.rg();
		s.Lg();
		
		
		
			//Selecting the Computers Product and Add to cart
				driver.findElement(By.xpath("(//*[text()=\"Computers \"])[1]")).click();
				driver.findElement(By.xpath("(//*[text()=\"Desktops \"])[3]")).click();
				driver.findElement(By.xpath("//*[text()=\"Build your own computer\"]")).click();
				
				WebElement pro=driver.findElement(By.xpath("//*[@id=\"product_attribute_1\"]"));
				Select processer=new Select(pro);
				processer.selectByValue("1");
				
				WebElement ram=driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]"));
				Select ram_1=new Select(ram);
				ram_1.selectByValue("5");
				
				driver.findElement(By.xpath("//*[@id=\"product_attribute_3_7\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]")).click();
				
				WebElement moiveto1=driver.findElement(By.xpath("(//*[text()=\"Computers \"])[1]"));
				Actions act = new Actions(driver);
				act.moveToElement(moiveto1).perform();
				
				WebElement note=driver.findElement(By.xpath("//*[text()=\"Notebooks \"]"));
				act.click(note).perform();
				
				
			
			driver.findElement(By.xpath("//*[text()=\"Apple MacBook Pro 13-inch\"]")).click();				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-4\"]")).click();
	
				WebElement moiveto=driver.findElement(By.xpath("(//*[text()=\"Computers \"])[1]"));
				
				act.moveToElement(moiveto).perform();
				
				WebElement soft=driver.findElement(By.xpath("//*[text()=\"Software \"]"));
				act.click(soft).perform();
				driver.findElement(By.partialLinkText("Sound Forge Pro 11 (recurring)")).click();
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-12\"]")).click();
				
				WebElement cart=driver.findElement(By.cssSelector("span.cart-label"));
				act.moveToElement(cart).perform();
				WebElement go_to_cart=driver.findElement(By.cssSelector("button.cart-button"));
				act.moveToElement(go_to_cart).click().perform();
				
	}

}
