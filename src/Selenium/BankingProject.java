package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BankingProject {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		//driver.get("https://demo.guru99.com/V1/index.php");
		//driver.findElement(By.name("uid")).sendKeys("mngr26593");
		//driver.findElement(By.name("password")).sendKeys("1234567@");
		//driver.findElement(By.name("btnLogin")).click();
		
		driver.get("https://demo.guru99.com/V1/html/Managerhomepage.php");
		
	    driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		//For Customer Name
		driver.findElement(By.name("name")).sendKeys("BradPit");
		//For Radio button
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		//For Date of Birth
		driver.findElement(By.id("dob")).sendKeys("21");
		driver.findElement(By.id("dob")).sendKeys("6");
		driver.findElement(By.id("dob")).sendKeys("1996");
		//For Address
		driver.findElement(By.name("addr")).sendKeys("D.no;1-83,Ammerpet,Hyderabad-500018");
		//For City
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		//For State
		driver.findElement(By.name("state")).sendKeys("Telangana");
		//For Pin code
		driver.findElement(By.name("pinno")).sendKeys("500018");
		//For Telephone Number
		driver.findElement(By.name("telephoneno")).sendKeys("9876543210");
		//For Email
		driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
		//For Submit
		driver.findElement(By.name("sub")).click();
		
		

	}

}
