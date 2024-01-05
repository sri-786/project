package package2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicWebtable_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table=driver.findElement(By.cssSelector("table.table-striped"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int rows_count=rows.size();
		System.out.println("total number of rows : "+ rows_count);
		
		
		List<WebElement> col=table.findElements(By.tagName("th"));
		int col_count=col.size();
		System.out.println("total number of column : "+ col_count);
		

		
		 for (WebElement row : rows) {
	           List<WebElement> cells = row.findElements(By.tagName("td"));
	            for (WebElement cell : cells) {
	                String cellText = cell.getText();
	            System.out.print(cellText+"\t");
	            }
	            System.out.println();
	        }

		
		
		


	}

}
