package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathPractice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Sri");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Kanth");
        driver.findElement(By.xpath("//*[@name=\"DateOfBirthDay\"]")).sendKeys("4");
        driver.findElement(By.xpath("//*[@name=\"DateOfBirthMonth\"]")).sendKeys("March");
        driver.findElement(By.xpath("//*[@name=\"DateOfBirthYear\"]")).sendKeys("2000");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sri12321@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("ABCD");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("srikanth1234");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("srikanth1234");
        driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
        //tagname[@attribute="value"]
//        xpath functions
   /*     1.starts-with()
        2.contains()
        3.text()
    */
        //realtivexpath:  //*[@name="email"]
        //start with function:: //*[starts-with(@name,"partial value")]
      //*[starts-with(@name,"ema")]
       //contains function:://*[contains(@attribute,"value")] 
      //*[contains(@name,"ail")]
      //text()://*[text()="value"]
	}

}
