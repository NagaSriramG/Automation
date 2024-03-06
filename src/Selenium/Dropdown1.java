package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		Select dropdown= new Select(driver.findElement(By.name("title")));
		//Index
		//Value
		//Visible text
		dropdown.selectByIndex(4);
		dropdown.selectByValue("Doctor");
		dropdown.selectByVisibleText("Major");

	}

}
