package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceProject {

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
		driver.findElement(By.id("user_firstname")).sendKeys("Broad");
		//Surname
		driver.findElement(By.id("user_surname")).sendKeys("Pit");
		//Phone
		driver.findElement(By.id("user_phone")).sendKeys("9876543210");
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
        driver.findElement(By.id("user_address_attributes_street")).sendKeys("49 Featherstone Street");
        //For city
        driver.findElement(By.id("user_address_attributes_city")).sendKeys("London");
        //For Country
        driver.findElement(By.id("user_address_attributes_county")).sendKeys("UK");
        //For Post Code 
        driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("EC1Y 8SY");
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
        //Dropdown6 for Breakdown cover
        Select dropdown6=new Select(driver.findElement(By.id("quotation_breakdowncover")));
        //Value
        dropdown6.selectByValue("3");
        //For Radiobutton2 Wind screen repair
        driver.findElement(By.id("quotation_windscreenrepair_t")).click();
        Thread.sleep(1000);
        //For Incidents
        driver.findElement(By.id("quotation_incidents")).sendKeys("Casual Insurance");
        //For Car Registration number
        driver.findElement(By.id("quotation_vehicle_attributes_registration")).sendKeys("BD 5I SMR");
        //For Car Mileage
        driver.findElement(By.id("quotation_vehicle_attributes_mileage")).sendKeys("13500 Miles");
        //For Car value
        driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1.08 Crores");
        //For Dropdown7 Parking Location
        Select dropdown7= new Select(driver.findElement(By.id("quotation_vehicle_attributes_parkinglocation")));
        //value
        dropdown7.selectByValue("Garage");
        Thread.sleep(1000);
        //Dropdown8 for Start Of Policy
        Select dropdown8=new Select(driver.findElement(By.name("year")));
        dropdown8.selectByValue("2023");
        Thread.sleep(1000);
        Select dropdown9=new Select(driver.findElement(By.name("month")));
        dropdown9.selectByValue("9");
        Thread.sleep(1000);
        Select dropdown10=new Select(driver.findElement(By.name("date")));
        dropdown10.selectByValue("16");
        Thread.sleep(2000);
        //For Save Quotation
        //driver.findElement(By.name("submit")).click();
        //For Calculate Premium
        driver.findElement(By.xpath("//*[@id=\"new_quotation\"]/div[8]/input[1]")).click();
        
                
        //For Retrieve Quotation
        driver.findElement(By.id("retrieve")).click();
        driver.findElement(By.name("id")).sendKeys("29920");
        driver.findElement(By.id("getquote")).click();
        
        
        //For Edit Profile
        driver.findElement(By.id("editprofile")).click();
        
        //For Insurance project 
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a")).click();

        
        
        
        //For Logout
        //driver.findElement(By.xpath("/html/body/div[3]/form/input")).click();
        
        
        
        
        
        
        
        
        
}

}