package polymorphism;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dateandtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		Date systemDate =new Date();
		System.out.println(systemDate);
		
		String date=systemDate.toString();
		
		String[] s=date.split(" ");
	
		String m=s[1];
		String m1="Mar";
		String d=s[2];
		String y=s[5];
		String y1="2023";
		System.out.println(m);
		System.out.println(d);
		System.out.println(y);
		
	
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
//		while(true){
//			
//			
//			String year=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
//			String month=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
//		
//			if((year.equals(y)) && (month.contains(m))){            
//				break;
//			}
//		else {
//		driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
//			
//		}
//		
//	}
//		//selecting day
//		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
//		for(WebElement dt:alldates) {
//			if(dt.getText().equals(d)) {
//				dt.click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		WebElement month1=driver.findElement(By.xpath("(//*[@class=\"datepick-month-year\"])[1]"));
		Select month11=new Select(month1);
		month11.toString().contains(m1);
		
		
		WebElement year1=driver.findElement(By.xpath("(//*[@class=\"datepick-month-year\"])[2]"));
		Select year11=new Select(year1);
		year11.selectByVisibleText(y1);
		
		
		List<WebElement> alldates1=driver.findElements(By.xpath("//*[@class=\"datepick\"]//td"));
		for(WebElement dt:alldates1) {
			if(dt.getText().equals(d)) {
				dt.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
//		while(true){
//			
//			
//			String year=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
//			String month=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
//		
//			if((year.equals(y)) && (month.contains(m))){            
//				break;
//			}
//		else {
//		driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
//			
//		}
//		
//	}
//		//selecting day
//		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
//		for(WebElement dt:alldates) {
//			if(dt.getText().equals(d)) {
//				dt.click();
//				break;
//			}
//		}
		
	}

	
}
