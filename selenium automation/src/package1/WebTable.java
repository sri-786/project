package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Srikanth");
		driver.findElement(By.id("email")).sendKeys("sri1232@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9347563498");
		
		driver.findElement(By.cssSelector("textarea#textarea")).sendKeys("Hyderabad");
		driver.findElement(By.cssSelector("input[id=\"male\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"monday\"]")).click();
		driver.findElement(By.cssSelector("input.form-check-input[id=\"tuesday\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"wednesday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"thursday\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"friday\"]")).click();
		
		WebElement i=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select india=new Select(i);
		india.selectByVisibleText("India");
		
		WebElement s=driver.findElement(By.xpath("//*[@id=\"colors\"]"));
		Select color=new Select(s);
		color.selectByValue("blue");
		color.selectByIndex(3);
		color.selectByVisibleText("White");
		
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("29/07/20023");
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"31\"]")).click();
		
		// 1) Find total number of rows 
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
		//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
		System.out.println("Number of rows:"+ rows); //7
		
		
		//2) Find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
		
		System.out.println("Number of columns:"+ cols); //4
		
		
		//3) Read specific row & column data
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		System.out.println(value); //Master In JS
		
		
		//4) Read data from all the rows & columns
		
		System.out.println("Book Name"+"	"+"Author"+"	"+"Subject"+"	"+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
//			4 elements in the row so thats why inside for loop will run for 4 times
			for(int c=1;c<=cols;c++)
			{
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value1+"\t"); 
			}
			
			System.out.println();
			System.out.println("---------------------------------------------------");
		
		}
		
			System.out.println("Price");
			
	
		for(int r1=2;r1<=rows;r1++)
		{
	//		4 elements in the row so thats why inside for loop will run for 4 times
		
				String valu=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]//td["+cols+"]")).getText();
				 
				System.out.print(valu+"\t"); 
				
				System.out.println();
			
		}
		System.out.println("---------------------------------------------------");
		
		int rows1=driver.findElements(By.xpath("//*[@id=\"productTable\"]//tr")).size();
		System.out.println("Number of rows:"+ rows1);
		
		int cols1=driver.findElements(By.xpath("//*[@id=\"productTable\"]//th")).size();
		System.out.println("Number of columns:"+ cols1);
		
		String v=driver.findElement(By.xpath("//*[@id=\"productTable\"]//tr[3]//td[3]")).getText();
		System.out.println(v);
		
		
		System.out.println("ID"+"	"+"Name"+"		"+"Price");
		
		for(int r4=1;r4<=rows1-1;r4++)
		{
			for(int c4=1;c4<=cols1;c4++) {
			String	s1=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r4+"]//td["+c4+"]")).getText();
			System.out.print(s1+"\t");
			
			}
			System.out.println();
			System.out.println("---------------------------------------------------");
			
		}
		
		driver.quit();
}

}
	
