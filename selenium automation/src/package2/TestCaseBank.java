package package2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;


public class TestCaseBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//CLICK ON BANK MANAGER LOGIN
		driver.findElement(By.xpath("//*[text()=\"Bank Manager Login\"]")).click();
		
		//ADD CUSTOMER
		driver.findElement(By.cssSelector("button.btn[ng-click=\"addCust()\"]")).click();
		String enter_name="Srikanth";
		driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys(enter_name);
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Last Name\"]")).sendKeys("Ganjanaboina");
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Post Code\"]")).sendKeys("522401");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		driver.switchTo().alert().accept();
		
		//OPEN ACCOUNT
		driver.findElement(By.cssSelector("button[ng-class=\"btnClass2\"]")).click();
		WebElement select_cls1=driver.findElement(By.id("userSelect"));
		Select select_c1=new Select(select_cls1);
		select_c1.selectByIndex(6);
		
		WebElement select_cls2=driver.findElement(By.name("currency"));
		Select select_c2=new Select(select_cls2);
		select_c2.selectByValue("Rupee");
		driver.findElement(By.xpath("//*[text()=\"Process\"]")).click();
		driver.switchTo().alert().accept();
		
		//CUSTOMERS VALIDATION
		driver.findElement(By.cssSelector("button[ng-class=\"btnClass3\"]")).click();
		
		int customer_name=driver.findElements(By.xpath("//*[contains(@class,\"table-bordered\")]//tr")).size();
		
		for(int s=2;s<=customer_name-1;s++) {
			String name=driver.findElement(By.xpath("//*[contains(@class,\"table-bordered\")]//tr["+s+"]//td[1]")).getText();
			if(name.equals(enter_name)) {
				System.out.println("Customer is Added");
				break;
			
			
			}
		}
		
		//CLICK ON HOME 
     	driver.findElement(By.xpath("//*[text()=\"Home\"]")).click();
		
     	//CLICK ON CUSTOMER LOGIN AND SELECT NAME
     	driver.findElement(By.xpath("//*[text()=\"Customer Login\"]")).click();
		WebElement select_n=driver.findElement(By.id("userSelect"));
		Select select_name=new Select(select_n);
		select_name.selectByVisibleText("Srikanth Ganjanaboina");
		driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
		
		
		//BEFORE DEPOSIT THE AMOUNT
		WebElement balence=driver.findElement(By.xpath("//*[@ng-hide=\"noAccount\"]//strong[2]"));
		String convert_to_str = balence.getText();
		Integer  convert_to_int=Integer.parseInt(convert_to_str);
		System.out.println("Before Deposit The Amount : "+convert_to_int);
	
		//AMOUNT DEPOSITED 4 TIMES
		driver.findElement(By.xpath("//*[@ng-click=\"deposit()\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Deposited :\"]//following::input")).sendKeys("4000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Deposited :\"]//following::input")).sendKeys("6000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Deposited :\"]//following::input")).sendKeys("14000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Deposited :\"]//following::input")).sendKeys("16000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		
		//AFTER DEPOSIT THE AMOUNT
		WebElement balence1=driver.findElement(By.xpath("//*[@ng-hide=\"noAccount\"]//strong[2]"));
		String convert_to_str1 = balence1.getText();
		Integer  convert_to_int1=Integer.parseInt(convert_to_str1);
		System.out.println("After Deposit The Amount : "+convert_to_int1);
		
		//VALIDATE THE AMOUNT ENTER OR NOT
		if(convert_to_int.equals(convert_to_int1)) {
			System.out.println("Amount is Not Enter");
			
		}else {
			System.out.println("Amount is  Enter");
		}
	
		//AMOUNT WITHDRAWL 4 TIMES
		
		driver.findElement(By.xpath("//*[@ng-click=\"withdrawl()\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("4000");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("6000");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("8000");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		
	
	
		//CLICK THE TRANSECTIONS AND PRINT THE TRANSECTION HISTORY
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@ng-class=\"btnClass1\"]")).click();
		
		int table_rows=driver.findElements(By.xpath("//*[contains(@class,\"table-striped\")]//tr")).size();
		System.out.println("Number of rows : "+table_rows);
		
		int table_cols=driver.findElements(By.xpath("//*[contains(@class,\"table-striped\")]//thead//tr//td")).size();
		System.out.println("Number of columns : "+table_cols);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t"+"Date-Time"+"\t"+"\t"+"Amount"+"\t"+"   "+"Transection Type");
		System.out.println("---------------------------------------------------------------");
		
		for(int i=1;i<=table_rows-1;i++) {
			for (int j=1;j<=table_cols;j++) {
				String text= driver.findElement(By.xpath("//*[contains(@class,\"table-striped\")]//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+"\t"+"\t");
			}
			System.out.println();
		}
		
	
	}

}
