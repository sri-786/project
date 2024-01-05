package demonopcommers;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Jewelry extends Login{

	public static void main(String[] args) {
		Login digital=new Login();
		digital.browser();
		digital.rg();
		digital.Lg();
		
		
	
		
		driver.findElement(By.xpath("//*[text()=\"Jewelry \"]")).click();
		driver.findElement(By.partialLinkText("Elegant Gemstone Necklace (rental)")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rental_start_date_40\"]")).click();
		String day="8";
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"rental_end_date_40\"]")).click();
		String month="OCTOBER";
		String year="2023";
		String day_="14";
	
		while(true){
			String current_month=driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
			System.out.println(current_month);
			String current_year=driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
			System.out.println(current_year);
			if((current_year.equals(year)) && (current_month.equals(month))){          
				break;
			}
			driver.findElement(By.xpath("//*[@title=\"Next\"]")).click();
		
		}
		//selecting day
		List<WebElement> alldatess=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
		for(WebElement dt:alldatess) {
			if(dt.getText().equals(day_)) {
				dt.click();
				break;
			}
		}
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-40\"]")).click();

		Actions act=new Actions(driver);
		WebElement cart1=driver.findElement(By.cssSelector("span.cart-label"));
		act.moveToElement(cart1).perform();
		WebElement go_to_cart1=driver.findElement(By.cssSelector("button.cart-button"));
		act.moveToElement(go_to_cart1).click().perform();

	
	}

}
