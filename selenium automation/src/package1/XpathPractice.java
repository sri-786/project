package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//*[text()=\"Test Automation\"]")).click(); //text() function
	
	    driver.findElement(By.id("name")).sendKeys("Srikanth");                 //id
	    driver.findElement(By.cssSelector("input#phone")).sendKeys("9315404598"); //cssSelector tag & id
	    driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("sri12354@gmail.com"); //tag name[attribute="attribute value"]
	    driver.findElement(By.cssSelector("input.form-control[id=\"password\"]")).sendKeys("123345678");//tag name.classvalue[attribute="attribute value"]
	    driver.findElement(By.cssSelector("textarea.form-control[id=\"address\"]")).sendKeys("Hyderabad");
	    driver.findElement(By.xpath("//input[@id=\"male\"]")).click();  //xpath relative
	    
	    driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();  
	    driver.findElement(By.xpath("//*[starts-with(@class,\"custom-select\")]")).sendKeys("Spain"); //xpath function starts-with()
	    driver.findElement(By.xpath("//*[text()=\"1 year\"]")).click();
	    driver.findElement(By.xpath("//*[text()=\"Selenium Webdriver\"]")).click(); //text() function
	    //driver.findElement(By.cssSelector("")).sendKeys("");
}
}