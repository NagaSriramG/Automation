package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginEvilTester {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://eviltester.github.io/TestingApp/apps/sloganizer/version/3/sloganizer.html");
		driver.findElement(By.xpath("/html/body/nav/div[1]/a")).click();

	}

}
