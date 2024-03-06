package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class EvilTester {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://eviltester.github.io/TestingApp/apps/sloganizer/version/3/sloganizer.html");
		Actions Act =new Actions(driver);
		WebElement Title =driver.findElement(By.xpath("/html/body/div[2]/button"));
		Thread.sleep(2000);
		for(int i=0;i<=21;i++) {
		Act.moveToElement(Title).click().perform();
		
		}
	}

}
