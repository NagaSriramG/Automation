package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentGatewayProject {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		//For  dropdown Mother Elephant Item Count  
		Select dropdown=new Select(driver.findElement(By.name("quantity")));
		//Value
		dropdown.selectByValue("9");
	}

}
