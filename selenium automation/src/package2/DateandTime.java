package package2;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateandTime {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
			
		        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		
			driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
				
			DateFormat formatedate=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				Date systemDate =new Date();
				
				System.out.println(systemDate);
				String dateofSystem = formatedate.format(systemDate);
			System.out.println(dateofSystem);
				String date=dateofSystem.substring(0,10);
				System.out.println(date);
				String[] x=date.split("/");
				String currentMonth=x[0];
				System.out.println(x[0]);
				
				String Day=x[1];
				System.out.println(x[1]);
				
				String currentYear=x[2];
				System.out.println(x[2]);
/*		
		String year="2022";
		String month="10";
		
		
		//select month and year
				while(true)
				{
					currentMonth=x[0];
					currentYear=x[2];
					System.out.println(currentMonth=x[0]);
					System.out.println(currentMonth=x[2]);
					//checking the condition with the given data
					if(currentYear.equals(year) && currentMonth.equals(month)) 
					{
						
						break;
					}
					else {
					//next button
					driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
				}}
				//selecting day
				List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
				for(WebElement dt:alldates) {
					if(dt.getText().equals(Day)) {
						dt.click();
						break;
					}
				}
				
		*/
	}

}
