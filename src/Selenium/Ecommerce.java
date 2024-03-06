package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("visual_user");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Sriram");
		driver.findElement(By.name("lastName")).sendKeys("Garikipati");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("500018");	
		driver.findElement(By.name("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("finish")).click();
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(3000);
		

	}

}
