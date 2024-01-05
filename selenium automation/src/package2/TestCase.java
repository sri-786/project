package package2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver();

		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("Srikanth");
		
		WebElement doubleClick1=driver.findElement(By.xpath("//*[text()=\"Copy Text\"]"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick1).perform();
		
		WebElement drag=driver.findElement(By.xpath("//*[text()=\"Drag me to my target\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(drag, drop).perform();

		driver.findElement(By.xpath("//*[text()=\"Alert\"]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[text()=\"Confirm Box\"]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[text()=\"Prompt\"]")).click();
		driver.switchTo().alert().sendKeys("Srikanth");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://ssc.nic.in/registration/home");
		driver.manage().window().maximize();
		
		WebElement selectClass1=driver.findElement(By.cssSelector("select.form-control[id=\"TypeofID\"]"));
		Select select_class1=new Select(selectClass1);
		select_class1.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input#IDnumber")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input#Name")).sendKeys("Srikanth");
		driver.findElement(By.cssSelector("input[name=\"VerifyName\"]")).sendKeys("Srikanth");
		driver.findElement(By.cssSelector("input[id=\"rbAadharNo\"]")).click();
		driver.findElement(By.cssSelector("input.form-control[id=\"FatherName\"]")).sendKeys("Chowdaiah");
		driver.findElement(By.cssSelector("input.form-control[id=\"VerifyFatherName\"]")).sendKeys("Chowdaiah");
		driver.findElement(By.cssSelector("input.form-control[name=\"MotherName\"]")).sendKeys("Padma");
		driver.findElement(By.cssSelector("input.form-control[name=\"VerifyMotherName\"]")).sendKeys("Padma");
		
		driver.findElement(By.cssSelector("input[name=\"DateOfBirth\"]")).sendKeys("04/12/2002");
		driver.findElement(By.cssSelector("input[name=\"VerifyDateOfBirth\"]")).sendKeys("04/12/2002");
		

		WebElement selectClass2=driver.findElement(By.cssSelector("select[name=\"EducationBoard\"]"));
		Select select_class2=new Select(selectClass2);
		select_class2.selectByValue("14");
		
		WebElement selectClass3=driver.findElement(By.cssSelector("select[id=\"ddlEducationBoard\"]"));
		Select select_class3=new Select(selectClass3);
		select_class3.selectByValue("14");
		

		
		driver.findElement(By.cssSelector("input[name=\"SecondaryRollNum\"]")).sendKeys("151413391");
		driver.findElement(By.cssSelector("input#VerifySecondaryRollNum")).sendKeys("151413391");
		
		WebElement selectClass4=driver.findElement(By.cssSelector("select[id=\"Yearofpassing\"]"));
		Select select_class4=new Select(selectClass4);
		select_class4.selectByVisibleText("2020");
		
		
		WebElement selectClass5=driver.findElement(By.cssSelector("select[id=\"ddlYearofpassing\"]"));
		Select select_class5=new Select(selectClass5);
		select_class5.selectByVisibleText("2020");

		
		driver.findElement(By.cssSelector("input[id=\"rbMale\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"rbVerifyMale\"]")).click();
		
		WebElement selectClass6=driver.findElement(By.cssSelector("select[id=\"Levelofeducationqualification\"]"));
		Select select_class6=new Select(selectClass6);
		select_class6.selectByValue("1");
		
		driver.findElement(By.cssSelector("input#MobileNum")).sendKeys("98352356988");
		driver.findElement(By.cssSelector("input[id=\"VerifyMobileNum\"]")).sendKeys("98352356988");
		
		driver.findElement(By.cssSelector("input[id=\"EmailID\"]")).sendKeys("gbsk2@gmail.com");
		driver.findElement(By.cssSelector("input[id=\"VerifyEmailID\"]")).sendKeys("gbsk2@gmail.com");
	
		WebElement selectClass=	driver.findElement(By.cssSelector("select.form-control[id=\"OriginState\"]"));
		Select select_class=new Select(selectClass);
		select_class.selectByVisibleText("Andhra Pradesh");
		
		driver.findElement(By.cssSelector("input.btn[id=\"btnsubmit1\"]")).click();
		*/
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
//		String b="Srikanth";
//		driver.switchTo().alert().sendKeys(b);
//		driver.switchTo().alert().accept();
//		String s=driver.findElement(By.xpath("//*[@id=\"output\"]")).getText();
//		System.out.println(s);
//		
//		String[] arr=s.split(" ");
//		String a=arr[3];
//		
//		if(a.equals(b)) {
//			System.out.println("Text will be same");
//		}else {
//			System.out.println("Text will not be same");
//		}
//		
	}

}
