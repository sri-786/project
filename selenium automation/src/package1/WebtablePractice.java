package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebtablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html?m=1");
		
		driver.manage().window().maximize();
 
		int rows=driver.findElements(By.xpath("//table[@border=\"1\"]//tr")).size(); //6  preferred
		//    prefered only if you have one single table
		System.out.println("Number of rows:"+ rows); 
		
		int cols=driver.findElements(By.xpath("//table[@border=\"1\"]//th")).size();
	 // dont prefer if you have multiple tables
		
		System.out.println("Number of columns:"+ cols); 
		
		for(int r=2;r<=rows;r++)
		{
//			4 elements in the row so thats why inside for loop will run for 4 times
			for(int c=1;c<=cols-2;c++)
			{
				String value1=driver.findElement(By.xpath("//table[@border=\"1\"]//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(value1+"\t"); 
				
			}
	}
		driver.quit();
	}
	}