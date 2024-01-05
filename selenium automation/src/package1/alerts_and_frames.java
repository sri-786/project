package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alerts_and_frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		
		
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//*[@onclick=\"myFunction()\"]")).click();
//		
//		driver.switchTo().alert().accept();
		
		/*driver.findElement(By.xpath("//*[text()=\"Alert with OK \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()=\"Alert with Textbox \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().sendKeys("Sri kanth");
		
		driver.switchTo().alert().accept(); 
		*/
		
		
		
		driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().accept();
		
//		Thread.sleep(3000);
//		
//		
//		String st=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
//		System.out.println(st);
//		String[] splitted_text=st.split(" ");//["You", "pressed", "Ok"]
//		
//		System.out.println(splitted_text[2]);
//		
//		String name_of_candidate=splitted_text[2];
//		String actual_name="Ok";
//		
//		if(actual_name.equals(name_of_candidate)){
//			System.out.println("Both names are matched");
//		}else {
//			System.out.println("Both names are not matched");
//		}
//		
//		
//		driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//		driver.switchTo().alert().dismiss(); 
//		
//		
//		String s=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
//		System.out.println(st);
//		String[] splitted_=s.split(" ");//["You", "pressed", "Cancel"]
//		
//		System.out.println(splitted_[2]);
//		
//		String name_=splitted_text[2];
//		String actual="OK";
//		
//		if(actual.equals(name_)){
//			System.out.println("Both names are matched");
//		}else {
//			System.out.println("Both names are not matched");
//		}
//		
	}
}

