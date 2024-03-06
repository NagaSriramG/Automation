package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
     
     WebDriver driver = new EdgeDriver();
     driver.get("https://demo.guru99.com/v4/");
     driver.findElement(By.name("uid")).sendKeys("mngr527174");
     Thread.sleep(3000);
     driver.findElement(By.name("password")).sendKeys("UtahepY");
     driver.findElement(By.name("btnLogin")).click();
     

	}

}
