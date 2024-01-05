package package2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("                                     Gainers Part                                    ");
		System.out.println("-------------------------------------------------------------------------------------");
		
				WebElement all_table=driver.findElement(By.xpath("//*[@class=\"dataTable\"]"));
				
				// Store all rows in table in rows variable in list.
				
				List <WebElement> rows=all_table.findElements(By.tagName("tr"));
			
				System.out.println("All table Number of rows : "+rows.size());
				
				List <WebElement> cols=all_table.findElements(By.tagName("th"));
				System.out.println("All table Number of columns : "+cols.size());
				
				rows.remove(0);
				
				for(WebElement row:rows) {
					
					List<WebElement> columns=row.findElements(By.tagName("td"));
										
					String group=columns.get(1).getText();
					
					String price=columns.get(3).getText();
					String price_str=price.replace(",", ""); 
					double current_price=Double.valueOf(price_str); // type convartion of str to double
					
					String change=columns.get(4).getText();
					String change2=change.replace("+", "");
					double change_percentage=Double.valueOf(change2); // type convartion of str to double
					
					// Get the filter rows of particular condition
					
					if (group.equals("B") && current_price>500 && change_percentage>5) {
						for(WebElement col1:columns) {
							
							System.out.print(col1.getText()+"  \t");
							
						}
						
						
						System.out.println();
						
						
					}
				}
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("                                     Losers Part                                     ");
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		driver.findElement(By.xpath("//*[text()=\"Losers\"]//following-sibling::div[1]")).click();
		driver.navigate().refresh();
		// Store web table in all_table 
		
		WebElement all_table2=driver.findElement(By.xpath("//*[@class=\"dataTable\"]"));
		
		// Store all rows in table in rows 
		
		List <WebElement> rows2=all_table2.findElements(By.tagName("tr"));
		System.out.println("All table Number of rows : "+rows2.size());
		
		List <WebElement> cols2=all_table.findElements(By.tagName("th"));
		System.out.println("All table Number of columns : "+cols2.size());
		
		rows2.remove(0);
		
		for(WebElement row:rows2) {
			
			List<WebElement> columns=row.findElements(By.tagName("td"));
			
			
			String group=columns.get(1).getText();
			
			// Get the current price from 4th index in columns list
			
			String price2=columns.get(3).getText();
			String price_str2=price2.replace(",", ""); 
			double current_price=Double.valueOf(price_str2); // type convartion of string to double
			
			String change=columns.get(4).getText();
			double change_percentage=Double.valueOf(change); // type convartion of str to double
		
			if (group.equals("T") && current_price<50 && change_percentage>-2) {
				
				for(WebElement col:columns) {
					
					System.out.print(col.getText()+"  \t");
					
				}
				
				System.out.println();
			
				
			}
		}
		
		}

	}
