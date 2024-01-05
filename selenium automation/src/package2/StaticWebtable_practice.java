package package2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaticWebtable_practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().setSize(new Dimension(1200,550));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table=driver.findElement(By.name("BookTable"));
		
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

		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

     
	
		
		
		
//		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html?m=1");
//		
//		driver.manage().window().maximize();
// 
//		int rows=driver.findElements(By.xpath("//*[@id=\"customers\"]//tbody//tr")).size(); //7  preferred
//		//    prefered only if you have one single table
//		System.out.println("Number of rows:"+ rows); 
//		
//		int cols=driver.findElements(By.xpath("//*[@id=\"customers\"]//tbody//th")).size();
//	 // dont prefer if you have multiple tables
//		
//		System.out.println("Number of columns:"+ cols); 
//		
//		for(int r=2;r<=rows;r++)
//		{
//			for(int c=1;c<=cols;c++)
//			{
//				String value1=driver.findElement(By.xpath("//*[@id=\"customers\"]//tbody//tr["+r+"]//td["+c+"]")).getText();
//				
//				System.out.print(value1+"\t"); 
//				
//			}
//			System.out.println();
//	}
//	
//	}
//	}
}}