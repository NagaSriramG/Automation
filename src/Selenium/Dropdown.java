package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		Select dropdown= new Select(driver.findElement(By.name("title")));
		//Index
		//Value
		//Visible text
		dropdown.selectByIndex(4);
		dropdown.selectByValue("Doctor");
		dropdown.selectByVisibleText("Doctor");
		//First Name
		driver.findElement(By.id("user_firstname")).sendKeys("Naga Sriram");
		//Surname
		driver.findElement(By.id("user_surname")).sendKeys("Garikipati");
		//Phone
		driver.findElement(By.id("user_phone")).sendKeys("7654321901");
		//Dropdown1 for Date of Birth
		Select dropdown1= new Select(driver.findElement(By.name("year")));
		//Value
		dropdown1.selectByValue("1995");
        Select dropdown2= new Select(driver.findElement(By.name("month")));
        //Value
        dropdown2.selectByValue("6");
        Select dropdown3= new Select(driver.findElement(By.name("date")));
        //value
        dropdown3.selectByValue("21");
        Thread.sleep(3000);
        //Radio Button
        driver.findElement(By.id("licencetype_f")).click();
        Thread.sleep(3000);
        //Dropdown4 For License Period
        Select dropdown4= new Select(driver.findElement(By.id("user_licenceperiod")));
        //value
        dropdown4.selectByValue("5");
        Thread.sleep(3000);
        //Dropdown5 For Occupation
        Select dropdown5= new Select(driver.findElement(By.id("user_occupation_id")));
        //Value
        dropdown5.selectByValue("4");
        Thread.sleep(3000);
        //For Address Street
        driver.findElement(By.id("user_address_attributes_street")).sendKeys("Lane no:1");
        //For city
        driver.findElement(By.id("user_address_attributes_city")).sendKeys("Hyderabad");
        //For Country
        driver.findElement(By.id("user_address_attributes_county")).sendKeys("Bharat");
        //For Post Code 
        driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("500018");
        //For Email
        driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("abc@gmail.com");
        //For Password
        driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("abhi@123");
        //For confirm password
        driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("abhi@123");
        Thread.sleep(3000);
        //For create button
        driver.findElement(By.name("submit")).click();
        //For Email
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //For Password
        driver.findElement(By.id("password")).sendKeys("abhi@123");
        Thread.sleep(3000);
        //For Login
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        //For Request Quotation
        driver.findElement(By.id("newquote")).click();
}

}