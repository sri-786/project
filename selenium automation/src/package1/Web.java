package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		driver.manage().window().maximize();
		
		//Web Table
		
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
		
		System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
//			4 elements in the row so thats why inside for loop will run for 4 times
			for(int c=1;c<=cols;c++)
			{
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(value1+"\t"); 
				
			}
			
			System.out.println();
			System.out.println("----------------------------------------");
		}
		
		//5) Read specific value related data
		
		System.out.println("	Price");
		System.out.println("----------------------------------------");
		for (int r=2;r<=rows;r++) {
		String str =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
		System.out.println("\t"+str);
		}
		//6) total amount of price
		int total_price=0;
		for (int r=2;r<=rows;r++) {
			String price= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
			int val=Integer.parseInt(price);
			total_price +=val;
			
		}
		System.out.println("----------------------------------------");
		System.out.println("total_amount_of_price:	" + total_price);
		System.out.println("----------------------------------------");
		
		//Pagination Table
		
		// 1) Find total number of rows 
		
		int rows1=driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
		System.out.println("Number of rows:"+rows1);
		
		//2) Find total number of columns
		
		int cols1=driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();
		System.out.println("Number of columns:"+cols1);
		
		//3) Read specific row & column data
		
		String v=driver.findElement(By.xpath("//*[@id=\"productTable\"]//tr[3]//td[3]")).getText();
		System.out.println(v);
		
		//4) Read data from all the rows & columns
		
		System.out.println("ID"+"	"+"Name"+"		"+"Price");
		
		for(int r4=1;r4<=rows1-1;r4++)
		{
			for(int c4=1;c4<=cols1;c4++) {
			String	s1=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r4+"]//td["+c4+"]")).getText();
			System.out.print(s1+"\t");
			
			}
			System.out.println();
			System.out.println("----------------------------------------");
			
		}
		
		//5) Read specific value related data
		
		System.out.println("	"+"Price");
		System.out.println("----------------------------------------");
		float tatal_amount_price=0;
		for (int r1=1;r1<=rows1-1;r1++) {
			
				String s=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r1+"]//td[3]")).getText();
				
				System.out.print("\t"+s);
				String m=s.substring(1);
				
				float st=Float.parseFloat(m);
		//6) total amount of price
				 tatal_amount_price += st;
				 
				//Select the check boxes grater then 10
				if(st>10) {
					driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+r1+"]/td[4]/input")).click();
		
					
				}
						
						System.out.println();
						
		}
		System.out.println("----------------------------------------");
		System.out.println("total amount of price	$"+tatal_amount_price);
		System.out.println("----------------------------------------");
		//driver.quit();

	
	}

	
}
