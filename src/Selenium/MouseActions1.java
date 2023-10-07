package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Actions Act =new Actions(driver);
		WebElement Desktop= driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement Mac= driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		Thread.sleep(1000);
		Act.moveToElement(Desktop).moveToElement(Mac).click().perform();

	}

}
