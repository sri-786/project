package package2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Demo_nopcommerce {

	public static void main(String[] args) throws  InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//GOTO URL
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Screen shot home page
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\homepage.png");
		FileUtils.copyFile(src, trg);
		//Register the WebSite Enter the all details
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Sri");
		driver.findElement(By.name("LastName")).sendKeys("Kanth");
		//it can be using select class date of birth
		WebElement select_d=driver.findElement(By.name("DateOfBirthDay"));
		Select select_day=new Select(select_d);
		select_day.selectByIndex(5);
		
		WebElement select_m=driver.findElement(By.name("DateOfBirthMonth"));
		Select select_month=new Select(select_m);
		select_month.selectByValue("3");
		
		WebElement select_y=driver.findElement(By.name("DateOfBirthYear"));
		Select select_year=new Select(select_y);
		select_year.selectByVisibleText("1998");
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("sri123@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"Company\"]")).sendKeys("Charani");
		driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("srikanth1234");
		driver.findElement(By.cssSelector("input[name=\"ConfirmPassword\"]")).sendKeys("srikanth1234");
		driver.findElement(By.cssSelector("button.button-1[id=\"register-button\"]")).click();
		
		//Screen shot for Registration successfully
		File regi_src=ts.getScreenshotAs(OutputType.FILE);
		File regi_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\register.png");
		FileUtils.copyFile(regi_src, regi_trg);
		//LOGIN THE WEBSITE
		
		driver.findElement(By.xpath("(//*[text()=\"Log in\"])[1]")).click();
		driver.findElement(By.id("Email")).sendKeys("sri123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("srikanth1234");
		driver.findElement(By.id("RememberMe")).click();
		
		//Screen shot for login
		
		File login_src=ts.getScreenshotAs(OutputType.FILE);
		File login_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\login.png");
		FileUtils.copyFile(login_src, login_trg);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.login-button[type=\"submit\"]")).click();
		
		//Create an Actions class and Selecting the Computer Desktop Products
		
		WebElement comp=driver.findElement(By.xpath("//*[text()=\"Computers \"]"));
		Actions act = new Actions(driver);
		act.moveToElement(comp).perform();
		
		WebElement desk=driver.findElement(By.xpath("//*[text()=\"Desktops \"]"));
		act.moveToElement(desk).click().perform();
		
		WebElement select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		Select select_position=new Select(select_sort);
		select_position.selectByValue("5");
		
		WebElement select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		Select select_size=new Select(select_display);
		select_size.selectByValue("9");
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("(//*[@class=\"product-title\"])[1]")).click();
		
		//Writing the sample review
		
		driver.findElement(By.linkText("Add your review")).click();
		driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("sample review");
		driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("This sample review is for the Build your own computer.");
		driver.findElement(By.xpath("//*[@id=\"addproductrating_4\"]")).click();
		driver.findElement(By.xpath("//*[@name=\"add-review\"]")).click();
		
		driver.findElement(By.partialLinkText("Build your own computer")).click();
		
		WebElement pro=driver.findElement(By.xpath("//*[@id=\"product_attribute_1\"]"));
		Select processer=new Select(pro);
		processer.selectByValue("1");
		
		WebElement ram=driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]"));
		Select ram_1=new Select(ram);
		ram_1.selectByValue("5");
		
		driver.findElement(By.xpath("//*[@id=\"product_attribute_3_7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product_attribute_5_11\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product_attribute_5_12\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-1\"]")).click();
		
		//Using an Actions class and Selecting the Computer Notebook Products
		
		WebElement moiveto1=driver.findElement(By.xpath("(//*[text()=\"Computers \"])[1]"));
		
		act.moveToElement(moiveto1).perform();
		
		WebElement note=driver.findElement(By.xpath("//*[text()=\"Notebooks \"]"));
		act.click(note).perform();
		
		driver.findElement(By.xpath("//*[@id=\"attribute-option-6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-9\"]")).click();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("6");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByValue("9");
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
	
		driver.findElement(By.partialLinkText("Apple MacBook Pro 13-inch")).click();		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-4\"]")).click();

		//Using an Actions class and Selecting the Computer Software Products
		
		WebElement moiveto=driver.findElement(By.xpath("(//*[text()=\"Computers \"])[1]"));
		act.moveToElement(moiveto).perform();
		
		WebElement soft=driver.findElement(By.xpath("//*[text()=\"Software \"]"));
		act.click(soft).perform();
		
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("10");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByVisibleText("3");
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Windows 8 Pro")).click();
		driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup-11\"]")).click();
		//selecting the shipping address
		WebElement ship=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
		Select ship_to=new Select(ship);
		ship_to.selectByVisibleText("India");
		
		WebElement other=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
		Select other_to=new Select(other);
		other_to.selectByVisibleText("Other");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("522401");
		driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-11\"]/div[4]/div[2]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-11\"]")).click();
		
		//ELECTRONICS
		
		//Using an Actions class and Selecting the Electronics items Camera & Photo
		WebElement ele=driver.findElement(By.xpath("//*[text()=\"Electronics \"]"));
	
		act.moveToElement(ele).perform();
		
		WebElement camera_photo=driver.findElement(By.xpath("//*[text()=\"Camera & photo \"]"));
		act.moveToElement(camera_photo).click().perform();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("11");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Leica T Mirrorless Digital Camera")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-16\"]")).click();
		
		//Using an Actions class and Selecting the Electronics items Cell phones
		
		WebElement ele1=driver.findElement(By.xpath("//*[text()=\"Electronics \"]"));
		act.moveToElement(ele1).perform();
		
		WebElement cell_phones=driver.findElement(By.xpath("//*[text()=\"Cell phones \"]"));
		act.moveToElement(cell_phones).click().perform();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("15");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(0);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.linkText("Nokia Lumia 1020")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-20\"]")).click();
		
		//Using an Actions class and Selecting the Electronics items Others
		
		WebElement ele2=driver.findElement(By.xpath("//*[text()=\"Electronics \"]"));
		act.moveToElement(ele2).perform();
		
		WebElement others=driver.findElement(By.xpath("//*[text()=\"Others \"]"));
		act.moveToElement(others).click().perform();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("5");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Beats Pill 2.0 Wireless Speaker")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-21\"]")).click();
		
		//APPAREL
		
		//Using an Actions class and Selecting the Apparel items Shoes
		WebElement app=driver.findElement(By.xpath("//*[text()=\"Apparel \"]"));
		act.moveToElement(app).perform();
		
		WebElement shoes=driver.findElement(By.xpath("//*[text()=\"Shoes \"]"));
		act.moveToElement(shoes).click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"attribute-option-14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-15\"]")).click();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("5");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("adidas Consortium Campus 80s Running Shoes")).click();
		
		WebElement sele=driver.findElement(By.xpath("//*[@id=\"product_attribute_9\"]"));
		Select select__shoes_size=new Select(sele);
		select__shoes_size.selectByValue("22");
		
		driver.findElement(By.xpath("//*[@title=\"Blue\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-25\"]")).click();
		
		//Using an Actions class and Selecting the Apparel items Clothing
		
		WebElement app1=driver.findElement(By.xpath("//*[text()=\"Apparel \"]"));
		act.moveToElement(app1).perform();
		
		WebElement clothing=driver.findElement(By.xpath("//*[text()=\"Clothing \"]"));
		act.moveToElement(clothing).click().perform();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("6");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(0);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Levi's 511 Jeans")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-30\"]")).click();
		
		//Using an Actions class and Selecting the Apparel items Accessories
		
		WebElement app2=driver.findElement(By.xpath("//*[text()=\"Apparel \"]"));
		act.moveToElement(app2).perform();
		WebElement accessories=driver.findElement(By.xpath("//*[text()=\"Accessories \"]"));
		act.moveToElement(accessories).click().perform();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("10");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Ray Ban Aviator Sunglasses")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-33\"]")).click();
		driver.navigate().back();
		
		//Two products added to the compare list
		driver.findElement(By.partialLinkText("Obey Propaganda Hat")).click();
		driver.findElement(By.xpath("//*[contains(@class,\"add-to-compare-list-button\")]")).click();
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Reversible Horseferry Check Belt")).click();
		driver.findElement(By.xpath("//*[contains(@class,\"add-to-compare-list-button\")]")).click();
		
		//DIGITAL DOWNLODE
		
		//click on DIGITAL DOWNLODE and Selecting the values and add to wishlist
		driver.findElement(By.xpath("//*[text()=\"Digital downloads \"]")).click();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("11");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Science & Faith")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-36\"]")).click();
	
		//BOOKS
		//click on BOOKS and Selecting the values and add to wishlist
		driver.findElement(By.xpath("//*[text()=\"Books \"]")).click();
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("15");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("First Prize Pies")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-38\"]")).click();

		//JEWELRY
		//click on JEWELRY and Selecting the values and add to wishlist
		driver.findElement(By.xpath("//*[text()=\"Jewelry \"]")).click();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("10");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(0);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Elegant Gemstone Necklace (rental)")).click();
		driver.findElement(By.xpath("//*[@id=\"rental_start_date_40\"]")).click();
		//Selecting the day
		String day="11";
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(day)) {
				dt.click();
				break;
			}
		}
		//Selecting the Date using Calendar concept
		driver.findElement(By.xpath("//*[@id=\"rental_end_date_40\"]")).click();
		String month="OCTOBER";
		String year="2023";
		String day_="14";
	
		while(true){
			String current_month=driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
		//	System.out.println(current_month);
			String current_year=driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
		//	System.out.println(current_year);
			if((current_year.equals(year)) && (current_month.equals(month))){          
				break;
			}
			driver.findElement(By.xpath("//*[@title=\"Next\"]")).click();
		
		}
		//selecting day
		List<WebElement> alldatess=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
		for(WebElement dt:alldatess) {
			if(dt.getText().equals(day_)) {
				dt.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-40\"]")).click();
		
		//GIFT CARDS
		
		//click on GIFT CARDS and Selecting the values and add to wishlist
		driver.findElement(By.xpath("//*[text()=\"Gift Cards \"]")).click();
		
		select_sort=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		select_position=new Select(select_sort);
		select_position.selectByValue("11");
		
		select_display=driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]"));
		select_size=new Select(select_display);
		select_size.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@data-viewmode=\"list\"]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("$100 Physical Gift Card")).click();
		driver.findElement(By.xpath("//*[@id=\"giftcard_45_RecipientName\"]")).sendKeys("RAM");
		driver.findElement(By.xpath("//*[@id=\"giftcard_45_Message\"]")).sendKeys("Tack a gift cards");
		
		//CLICK ON THE WISHLIST 
		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-45\"]")).click();
		driver.findElement(By.cssSelector("span.wishlist-label")).click();
		
		

		File wishlist_src=ts.getScreenshotAs(OutputType.FILE);
		File wishlist_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\wishlist.png");
		FileUtils.copyFile(wishlist_src, wishlist_trg);
		
		
	
		//size of the wishlist table
		int wishlist_table_lenght=driver.findElements(By.xpath("//*[@action=\"/wishlist\"]//tbody//tr")).size();
		
		//using the for loop then Selecting the all items
		for(int i=1;i<=wishlist_table_lenght;i++) {
			driver.findElement(By.xpath("//*[@action=\"/wishlist\"]//tbody//tr["+i+"]//td[1]")).click();
		}
		
		File wishlist_select_src=ts.getScreenshotAs(OutputType.FILE);
		File wishlist_select_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\selectwishlist.png");
		FileUtils.copyFile(wishlist_select_src, wishlist_select_trg);
		//CLICK ON THE SHOPPING CART
		
		//wishlist items added to shopping cart
		driver.findElement(By.cssSelector("button.wishlist-add-to-cart-button[name=\"addtocartbutton\"]")).click();
		WebElement cart1=driver.findElement(By.cssSelector("span.cart-label"));
		act.moveToElement(cart1).perform();
		WebElement go_to_cart1=driver.findElement(By.cssSelector("button.cart-button"));
		act.moveToElement(go_to_cart1).click().perform(); 
		
		//Take Screen shot shopping cart
		
		File shopping_cart_src=ts.getScreenshotAs(OutputType.FILE);
		File shopping_cart_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\shoppingcart.png");
		FileUtils.copyFile(shopping_cart_src, shopping_cart_trg);
		//REMOVING THE SOME ITEMS IN SHOPPING CART
		
		driver.findElement(By.xpath("(//*[@name=\"updatecart\"])[1]")).click();
		driver.findElement(By.xpath("(//*[@name=\"updatecart\"])[2]")).click();
		driver.findElement(By.xpath("(//*[@name=\"updatecart\"])[3]")).click();
		driver.findElement(By.xpath("(//*[@name=\"updatecart\"])[4]")).click();
		
		//UPDATE THE SHOPING CART
		
		driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
		
	
		File update_shopping_cart_src=ts.getScreenshotAs(OutputType.FILE);
		File update_shopping_cart_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\updateshoppingcart.png");
		FileUtils.copyFile(update_shopping_cart_src, update_shopping_cart_trg);
		
		
		//OPEN ESTIMATE-SHIPPING POPUP
		 //select the all values
		driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup\"]")).click();
		ship=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
		ship_to=new Select(ship);
		ship_to.selectByVisibleText("India");
		
		other=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
		other_to=new Select(other);
		other_to.selectByVisibleText("Other");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("110001");
		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
		driver.navigate().refresh();
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"checkout_attribute_1\"]"));
		Select check_out=new Select(checkout);
		check_out.selectByVisibleText("Yes [+$10.00]");
		
		//Enter Discount coupon here 
		driver.findElement(By.xpath("//*[@id=\"discountcouponcode\"]")).sendKeys("301134889");
		driver.findElement(By.xpath("//*[@id=\"applydiscountcouponcode\"]")).click();
		//Enter gift card code
		driver.findElement(By.xpath("//*[@id=\"giftcardcouponcode\"]")).sendKeys("QWER-ASDF45-3ZX7");
		driver.findElement(By.xpath("//*[@id=\"applygiftcardcouponcode\"]")).click();
		
		//CLICK ON THE CHECKOUT BUTTON
		
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		//Billing address
		
		WebElement countrys=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]"));
		Select select_country=new Select(countrys);
		select_country.selectByVisibleText("India");
		
		WebElement state=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]"));
		Select state_other=new Select(state);
		state_other.selectByVisibleText("Other");
		
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("Guntur");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("6-1-4A, Guntur, Andra Pradesh");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("6-1-4A, Guntur, Andra Pradesh");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("522401");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9342632366");
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@onclick=\"Billing.save()\"]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"shippingoption_1\"]")).click();
		driver.findElement(By.cssSelector("button.shipping-method-next-step-button")).click();
		
		//click on payment method
		
		driver.findElement(By.cssSelector("button.payment-method-next-step-button")).click();
		driver.findElement(By.cssSelector("button.payment-info-next-step-button")).click();
		
		//click on the confirm order
		
		driver.findElement(By.cssSelector("button.confirm-order-next-step-button")).click();
		Thread.sleep(3000);
		
		//Take Screen shot for order confirm
		
				File order_confirm_src=ts.getScreenshotAs(OutputType.FILE);
				File order_confirm_trg=new File("C:\\Users\\gbsk2\\OneDrive\\Desktop\\Screen Shots\\orderconfirm.png");
				FileUtils.copyFile(order_confirm_src, order_confirm_trg);
		//click on the order is completed and continue
		
		driver.findElement(By.cssSelector("button.order-completed-continue-button")).click();
		
		
		

	

// FOOTER SECTION
		 
	//INFORMATION  
				 
		String parent_handle=driver.getWindowHandle();
		 int information=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[1]//li")).size();
		 
		 String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 
		 // Click on all linkTabs in information section
		 
		 for (int i=1;i<=information;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[1]//li["+i+"]//a")).sendKeys(clickonlinkTab);
		 }
		 Set<String> chaild_handle=driver.getWindowHandles();
		 List<String> chaild_win_handle=new ArrayList<String>(chaild_handle);
		 
		 // Switch every opened Tab and close it
		 System.out.println("----------------------------------------------");
		 System.out.println("INFORMATION  ");
		 System.out.println("----------------------------------------------");
		 
		 for(String information_ids:chaild_win_handle) {
			 
			 if (!information_ids.equals(parent_handle)) {
				 
				 driver.switchTo().window(information_ids);
				 System.out.println(driver.getTitle());
				 driver.close();
				 
			 }
			 
			 
		 }
		 driver.switchTo().window(parent_handle);
		 
		 //CUSTOMER SERVICE 
		 
		 int customerservice=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[2]//li")).size();
		// Click on all linkTabs in Customer Service
		 for (int i=1;i<=customerservice;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[2]//li["+i+"]//a")).sendKeys(clickonlinkTab);
		 }
		 
		 // Get the window id's of all opened windows
		 
		 Set<String> chaild_handle_customer=driver.getWindowHandles();
		 List<String> chaild_handle_customer_service=new ArrayList<String>(chaild_handle_customer);
		 
		 // Switch every opened window and print the titil of the window and close it
		 
		 System.out.println("----------------------------------------------");
		 System.out.println("CUSTOMER SERVICE ");
		 System.out.println("----------------------------------------------");
		 
		 for(String customer_service_ids:chaild_handle_customer_service) {
			 
			 if (!customer_service_ids.equals(parent_handle)) {
				 
				 driver.switchTo().window(customer_service_ids);
				 System.out.println(driver.getTitle());
				 driver.close();
				 
			 }
			 
			 
		 }
		 driver.switchTo().window(parent_handle);
		 
		 //MY ACCOUNT
		 
		 int myaccount=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[3]//li")).size();
		
		 // Click on all linkTabs in My Account Section 
		 
		 for (int i=1;i<=myaccount;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[3]//li["+i+"]//a")).sendKeys(clickonlinkTab);
		 }
		 
		 
		 Set<String> chaild_handle_account=driver.getWindowHandles();
		 List<String> chaild_handle_my_account=new ArrayList<String>(chaild_handle_account);
		 
		 // Switch every opened tab and close it
		 
		 System.out.println("----------------------------------------------");
		 System.out.println("MY ACCOUNT ");
		 System.out.println("----------------------------------------------");
		 
		 for(String my_account_ids:chaild_handle_my_account) {
			 
			 if (my_account_ids.equals(parent_handle)) {
				 
				 driver.switchTo().window(my_account_ids);
				 System.out.println(driver.getTitle());
				 
			 }else {
				 driver.switchTo().window(my_account_ids);
				 System.out.println(driver.getTitle());
				 driver.close();
			 }
			 
			 
		 }
		 
		 driver.switchTo().window(parent_handle);
		 
		//FOLLOW US 
		 
		 int s_followus=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[4]//li")).size();
		 
		 for (int i=1;i<=s_followus;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[4]//li["+i+"]//a")).sendKeys(clickonlinkTab);
		 }
		 
		 
		 Set<String> chaild_handle_follow=driver.getWindowHandles();
		 List<String> chaild_handle_follow_us=new ArrayList<String>(chaild_handle_follow);
		 
		 // Switch every opened Tab and close it
		 
		  for(String follow_us_ids:chaild_handle_follow_us) {
			 
			 if (!follow_us_ids.equals(parent_handle)) {
				 
				 driver.switchTo().window(follow_us_ids);
				 driver.close();
				 }
			 	
		 
		 
		  }
	
	}

}
