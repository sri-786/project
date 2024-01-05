package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_without_select {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.vivino.com/");
	
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.xpath("//span[text()=\"Language\"]")).click();
		List<WebElement> li=driver.findElements(By.xpath("//ul[contains(@class,\"languageDropdown\")]//li"));
		
		String language="Italiano";
		
		for(WebElement i: li) {
			if(i.getText().equals(language)) {
				i.click();
				break;
			}
		}
		
		
		
		
		}
		

	}

