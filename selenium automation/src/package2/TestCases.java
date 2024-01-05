package package2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		 driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@value=\"radio2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("India");
		
		WebElement s=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		Select r=new Select(s);
		r.selectByValue("option2");
		
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		
		String parentHandle=driver.getWindowHandle();
		
		//Switch to Window
		System.out.println(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		Set<String> chaildHandle=driver.getWindowHandles();
		for(String handle:chaildHandle) {
			//System.out.println(handle);
				if(!handle.equals(parentHandle)) {
					String title=driver.switchTo().window(handle).getTitle();
					System.out.println(title);
					driver.close();
					
		}
	}
		Thread.sleep(3000);
		//Switch to tab
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
		Set<String> chaildHandle1=driver.getWindowHandles();
		for(String handle:chaildHandle1) {
			//System.out.println(handle);
				if(!handle.equals(parentHandle)) {
					String title=driver.switchTo().window(handle).getTitle();
					System.out.println(title);
					driver.close();
					
		}
	}
		Thread.sleep(3000);
		//Switch to alert
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Srikanth");
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
		driver.switchTo().alert().accept();
		
		//WEB TABLES
		
		//1) find the total number of rows
		int total_rows= driver.findElements(By.xpath("//*[@name=\"courses\"]//tr")).size();
		System.out.println("Total no of rows :"+total_rows);
		
		//2) find the total number of columns
		int total_columns= driver.findElements(By.xpath("//*[@name=\"courses\"]//th")).size();
		System.out.println("Total no of rows :"+total_columns);
		
		//3) Read specific row & column data
		String value=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr[5]//td[2]")).getText();
		System.out.println(value);
		
		//4) Read data from all the rows & columns
		
		System.out.println("Instructor"+"	"+"Course"+"	"+"Price");
		
		for(int i=2;i<=total_rows;i++) {
			for (int j=1;j<=total_columns;j++) {
				String data=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"\t");
				
			}
			System.out.println();
			System.out.println("---------------------------------------------");
			
		}
		//5) Read specific value related data
		
		System.out.println("\t"+"\t"+"Price");
		System.out.println("\t"+"    ---------");
		
		for(int r2=2;r2<=total_rows;r2++) {
			String sp_value=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr["+r2+"]//td[3]")).getText();
			System.out.println("\t"+"\t"+sp_value);
		}
		
		//6) total amount of price
		int total_amount_price=0;
		for(int r1=2;r1<=total_rows;r1++) {
			String sp_value=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr["+r1+"]//td[3]")).getText();
			int price=Integer.parseInt(sp_value);
			total_amount_price +=price;
		}
		System.out.println("\t"+"    ---------");
		System.out.println("Total Price:"+"\t"+total_amount_price);
		System.out.println("\t"+"    ---------");
		
		
		
		//Element Display
		driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("Srikanth");
		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();//Hide Element
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();//display Element
		
		//Mouse Hover
		WebElement mouse_hover=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse_hover).perform();	
		
		WebElement mouse_hover1=driver.findElement(By.xpath("//*[text()=\"Top\"]"));
		
		act.moveToElement(mouse_hover1).click().perform();	
		
	
		//Window handling
		// 3-
		WebElement coloumndriver = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		int s1=coloumndriver.findElements(By.tagName("a")).size();

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		List<String> win_id_list=new ArrayList<>(abc);
		for(int i=0;i<s1;i++)
		{
			driver.switchTo().window(win_id_list.get(i));
			System.out.println(driver.getTitle());
			System.out.println("---------------------------------------------");
			
			}

		

	}
		
	}


