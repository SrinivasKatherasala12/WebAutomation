package Restaurants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Restaurants {

	 WebDriver driver;

	@BeforeTest
	public void init() {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pwiddy.interview.tisostudio.com/");

	}

	@Test
	public void foodDeliveryPage() {

		try {

			//Thread.sleep() is used to pause the execution temporarily, which helps in observing the flow of the web page more easily. However, it is generally recommended to use one of the three types of waits available in Selenium for better efficiency and reliability: Implicit Wait, Explicit Wait, and Fluent Wait.
                        Thread.sleep(5000);
			WebElement searchrestaurants = driver
					.findElement(By.xpath("//input[@placeholder=\"Search for restaurants...\"]"));
			searchrestaurants.sendKeys("Swaniawski and Sons");
			Thread.sleep(3000);
			WebElement clickOnSwaniawskiRestaurant = driver.findElement(By.xpath("//h2[contains(text(),\"Swaniawski and Sons\")]"));
			clickOnSwaniawskiRestaurants.click();
			Thread.sleep(3000);
			WebElement addToCartBtn = driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')][1]"));
			addToCart.click();
			Thread.sleep(3000);
			WebElement clickOnAddToCartIcon = driver.findElement(By.xpath("//a[@class=\"flex items-center justify-center w-16 h-16 bg-red-600 text-white rounded-full shadow-lg hover:bg-red-700 transition-colors\"]"));
			ClcikAddToCartIcon.click();
			Thread.sleep(3000);
			WebElement clickOnProceedtoCheckoutBtn= driver.findElement(By.xpath("//button[contains(text(),'Proceed to Checkout')]"));
			clickOnProceedtoCheckout.click();
			Thread.sleep(3000);
			WebElement clickOnStreetAddress= driver.findElement(By.xpath("//input[@id=\"address\"]"));
			clickOnStreetAddress.sendKeys("Sri Prasanna Anajaneya nagar");
			Thread.sleep(3000);
			WebElement clickOnCity= driver.findElement(By.xpath("//input[@id=\"city\"]"));
			clickOnCity.sendKeys("Devapur");
			Thread.sleep(3000);
			WebElement clickOnZipCode= driver.findElement(By.xpath("//input[@id=\"zipCode\"]"));
			clickOnZipCode.sendKeys("504218");
			Thread.sleep(3000);
			WebElement clickOnPhoneNumber= driver.findElement(By.xpath("//input[@id=\"phone\"]"));
			clickOnPhone.sendKeys("8374458189");
			Thread.sleep(3000);
			WebElement clickPlaceOrder= driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
			clickPlaceOrder.click();
			Thread.sleep(3000);
			WebElement clickContinueShoppingBtn= driver.findElement(By.xpath("//a[contains(text(),'Continue Shopping')]"));
			clickContinueShopping.click();
			Thread.sleep(3000);
		
		} catch (Exception e) {
		}

	}

	@AfterTest
	public void quit() {

		driver.quit();
	}

}
