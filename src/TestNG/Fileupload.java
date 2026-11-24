package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void fileM()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void filetest()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div[2]/div[1]/div/div/input")).sendKeys("E:\\Software_Testing_Presentation_Seventh_Day_High_School.pptx");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/ul/li/div[1]/button")).click();
	}
	

}
