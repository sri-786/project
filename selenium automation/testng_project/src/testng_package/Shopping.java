package testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shopping {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void browaer() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void login() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@Test(priority = 3)
	public void order() throws InterruptedException {
		Thread.sleep(3000);
		WebElement se = driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]"));
		Select selet = new Select(se);
		selet.selectByValue("lohi");
	}

	@Test(priority = 4)
	public void addCardItem1() {
		driver.findElement(By.xpath("//*[@id=\"item_2_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@Test(priority = 5)
	public void addCardItem2() {
		driver.findElement(By.xpath("//*[@id=\"item_0_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@Test(priority = 6)
	public void addCardItem3() {
		driver.findElement(By.xpath("//*[@id=\"item_1_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@Test(priority = 7)
	public void addCardItem4() {
		driver.findElement(By.xpath("//*[@id=\"item_3_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@Test(priority = 8)
	public void addCardItem5() {
		driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@Test(priority = 9)
	public void addCardItem6() {
		driver.findElement(By.xpath("//*[@id=\"item_5_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@Test(priority = 10)
	public void openShoppingCard() {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
	}

	@Test(priority = 11)
	public void checkout() {

		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	}

	@Test(priority = 12)
	public void myInformation() {
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Sri");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("kanth");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("542348");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}

	@Test(priority = 13)
	public void finishShopping() {

		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
	}

	@Test(priority = 14)
	public void backToHome() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	}

	@AfterTest
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
}