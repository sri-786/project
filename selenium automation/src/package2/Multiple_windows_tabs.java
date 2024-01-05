package package2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiple_windows_tabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Open New Window
		
		String parentHandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		Set<String> chaildHandle=driver.getWindowHandles();
		
		for(String handle:chaildHandle) {
			if(!handle.equals(parentHandle)) {
				
				String title=driver.switchTo().window(handle).getTitle();
			
				System.out.println(title);
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sri");
				driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("kanth");
				driver.findElement(By.xpath("//*[@id=\"malerb\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"englishchbx\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"hindichbx\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sri123@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("srikanth1234");
				
	}
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Srikanth");
		
		//Open New Tab
		
		driver.findElement(By.xpath("//*[@id=\"newTabBtn\"]")).click();
		Set<String> chaildHandle1=driver.getWindowHandles();
		
		for(String handle1:chaildHandle1) {
			if(!handle1.equals(parentHandle)) {
				
				String title=driver.switchTo().window(handle1).getTitle();
				
				System.out.println(title);
				driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
				driver.switchTo().alert().sendKeys("Srikanth");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.close();
				
				
				
}
}
		//Open Multiple Windows
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"newWindowsBtn\"]")).click();
		Set<String> chaildHandle12=driver.getWindowHandles();
		
		for(String handle2:chaildHandle12) {
			if(!handle2.equals(parentHandle)) {
				
				String title=driver.switchTo().window(handle2).getTitle();
				
				System.out.println(title);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
	}
		}
		
		//Open Multiple Tabs
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"newTabsBtn\"]")).click();
		
		Set<String> win=driver.getWindowHandles();
		List<String> win_li=new ArrayList<>(win);
		
		for (String winodw_id:win_li) {
			String title=driver.switchTo().window(winodw_id).getTitle();
			
			System.out.println(title);
			
			if (title.equalsIgnoreCase("AlertsDemo - H Y R Tutorials")) {
				driver.findElement(By.id("alertBox")).click();
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				
				driver.findElement(By.id("confirmBox")).click();
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
				driver.switchTo().alert().sendKeys("Srikanth");
				driver.switchTo().alert().accept();
				
				driver.close();
				
			}else if (title.equals("Basic Controls - H Y R Tutorials")) {
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Sri");
				driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kanth");
				driver.findElement(By.xpath("//*[@id=\"englishchbx\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"hindichbx\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sri@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Srikanth123");
				driver.findElement(By.xpath("//*[@id=\"registerbtn\"]")).click();
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		
		

	}

}
