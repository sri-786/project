package package2;



import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dateandtime_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		/*
        driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		
		Date systemDate =new Date();
		
		//System.out.println(systemDate);
		
		String s=systemDate.toString();
		String[] x=s.split(" ");
		String select_day=x[2];
		String month=x[1];
		String year=x[5];
		
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[5]);
		
			


		//select month and year
		while(true)
		{
			String currentYear=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
			String currentMonth=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
			
			
			if(currentYear.equals(year) && currentMonth.contains(month)) 
			{
				
				break;
			}
			else {
			//next button
			driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}}
		//selecting day
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(select_day)) {
				dt.click();
				break;
			}
		}
		
		*/
		//Drop Down Calendar
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String select_day1="20";
		int select_mon=10;
		String select_yr="2025";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		WebElement select_month=driver.findElement(By.xpath("(//*[@class=\"datepick-month-year\"])[1]"));
		Select month1=new Select(select_month);
		month1.selectByIndex(select_mon);
		
		
		WebElement select_year=driver.findElement(By.xpath("(//*[@class=\"datepick-month-year\"])[2]"));
		Select year1=new Select(select_year);
		year1.selectByVisibleText(select_yr);
		
		
		
		List<WebElement> alldates1=driver.findElements(By.xpath("//*[@class=\"datepick-month\"]//td"));
		for(WebElement dt1:alldates1) {
			if(dt1.getText().equals(select_day1)) {
				dt1.click();
				break;
			}
		}
		
		
/*
	// Date and time calendar
	
	driver.get("https://demoqa.com/date-picker");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// Click on date and time input box
	
	driver.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).click();
	
	
	
	String day="10";
	String month_dt="October";
	String year_dt="2025";
	String time="09:15";
	
	
	
	// Get current month and year frome calendar
	
	// Year and month
	
	while(true) {
		String current_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();

		String[] current_month_year_arr=current_month_year.split(" ");
		String current_month=current_month_year_arr[0];
		String current_year=current_month_year_arr[1];
		
		if (year_dt.equals(current_year) && month_dt.equals(current_month)) {
			break;
		}
		
		driver.findElement(By.xpath("//button[text()=\"Next Month\"]")).click();
		
	}
	
	// day 
	
	List<WebElement> allDays=driver.findElements(By.xpath("//*[@class=\"react-datepicker__month\"]//div"));
	for(WebElement check_day:allDays) {
		if (check_day.getText().equals(day)) {
			check_day.click();
			break;
		}
	}
	
	// Time
	
	List<WebElement> all_times=driver.findElements(By.xpath("//ul[contains(@class,\"time-list\")]//li"));
	for(WebElement time_e:all_times) {
		
		if(time_e.getText().equals(time)) {
			time_e.click();
			break;
		}
	}
*/
	
	}

}
