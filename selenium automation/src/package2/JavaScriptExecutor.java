package package2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Fetching the Domain Name of the site. Tostring() change object to name.
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site = " + DomainName);

		// Fetching the URL of the site. Tostring() change object to name
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site = " + url);

		// Method document.title fetch the Title name of the site. Tostring() change
		// object to name
		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = " + TitleName);

	//	WebElement name = driver.findElement(By.id("name"));
	//	js.executeScript("arguments[0].setAttribute('value','Srikanth')", name);
		
		
		// First name - inputbox
	//	WebElement inputbox = driver.findElement(By.id("email"));
	//	js.executeScript("arguments[0].setAttribute('value','sri123@gmail.com')", inputbox);

		// Radio button
//		WebElement male_Rd = driver.findElement(By.id("male"));
//		// male_Rd.click(); //ClickInterceptedException
//		js.executeScript("arguments[0].click();", male_Rd);
//
//		// Checkbox
//		WebElement chkbox = driver.findElement(By.id("sunday"));
//		js.executeScript("arguments[0].click();", chkbox);
		
		
		
		
		js.executeScript("document.getElementById('name').value='Srikanth';");
		js.executeScript("document.getElementById(\"name\").style.border='red';");
		
		js.executeScript("document.getElementById('email').value='sri123@gmail.com';");
		js.executeScript("document.getElementById('male').click();");
		js.executeScript("document.querySelector(\"label[for='male']\").style.color='blue';");
		
		js.executeScript("document.getElementById('sunday').click();");
	
		
			
		
		String height=js.executeScript("return window.innerHeight;").toString();
		String width=js.executeScript("return window.innerWidth;").toString();
		System.out.println("innerHeight : "+height);
		System.out.println("innerWidth : "+width);
		
		
		// button

		// 1) scroll down page by pixel
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); // 3000
		

		// 2) scroll down the page till the element is present
		WebElement flag = driver.findElement(By.xpath("//*[@id=\"HTML1\"]"));

		js.executeScript("arguments[0].scrollIntoView();", flag);
		System.out.println(js.executeScript("return window.pageYOffset;")); // 5077.40234375

		// 3) scroll down till end of the page/document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		Thread.sleep(3000);

		// go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

//		Thread.sleep(5000);
//		js.executeScript("location.reload()");

		// RE DIRECT TO ANOTHER PAGE
		// js.executeScript("window.location='https://google.com'");

	}

}
