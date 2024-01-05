package package2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CalenderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
	
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		String year_e="2025";
		String month_e="March";
		String day="4";		
		String month=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
		String year=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
		
		
		while(true){
			
			driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			 year=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
			 month=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
			
			if((year.equals(year_e)) && (month.equals(month_e))){    //Aug=march    //2023=2025            (AND &&)(OR ||) (NOT !)
				break;
			}
		
		}
		//selecting day
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
		
			
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
        
        
//		String year="2012";
//		String month="December";
//		String Day="12";
//		
//		//select month and year
//				while(true)
//				{
//					//current year
//					String currentYear=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
//					
//					//current month
//					String currentMonth=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
//					
//					//checking the condition with the given data
//					if(currentYear.equals(year) && currentMonth.equals(month)) 
//					{
//						
//						break;
//					}
//					else {
//					//next button
//					driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
//				}}
//				//selecting day
//				List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
//				for(WebElement dt:alldates) {
//					if(dt.getText().equals(Day)) {
//						dt.click();
//						break;
//					}
//				}
//					
//				
//	
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//				
//		for(int i=0;i<12;i++) {
//		driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
//		}
//		
//		
//		List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
//		for(WebElement dt:alldates1) {
//			if(dt.getText().equals("21")) {
//				dt.click();
//				break;
//			}
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		Approach-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");//mm/dd/yyyy

		//Approach-2
		String year="2025";
		String month="April";
		String Day="22";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//input://input[@id="datepicker"]
		//select month and year
				while(true)
				{
					//current month
					String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();////span[@class="ui-datepicker-month"]
					//current year
					String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();////span[@class="ui-datepicker-year"]
					//checking the condition with the given data
					if(yr.equals(year) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
					{
						
						break;
					}
					//next button
					driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
					
				}
				//selecting day
				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
				for(WebElement dt:alldates) {
					if(dt.getText().equals(Day)) {
						dt.click();
						break;
					}
				}*/
	}

}
