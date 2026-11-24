package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestKP.Excelutils;

public class Kptest {
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/success");
	}
@DataProvider(name = "loginData")
     public Object[][] getData() throws IOException 
	{
		
		String path= "C:\\Users\\acer\\Desktop\\bug reports LUM\\Login_details.xlsx";
		return Excelutils .getTestData(path,"Sheet1");
	}
	@Test(dataProvider = "loginData")
	public void loginTest(String username,String password )
	{
		driver.findElement(By.name("ulogin")).sendKeys(username);
		driver.findElement(By.id("upass")).sendKeys(password);
		driver.findElement(By.id("sub_logbtn")).click();
		
		System.out.println("Executed for:"+username);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		String currenturl=driver.getCurrentUrl();
		System.out.println("Redirected to:"+currenturl);
		Assert.assertEquals(currenturl,"https://keralaproperty.in/member/myhome/",
		"login may have failed for:"+username);
		
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
