package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod 
	public void jsmeth()
	{
		driver.manage().window().maximize();

		driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test()
	{
		SoftAssert soft=new SoftAssert();
		String title = driver.getTitle();
		soft.assertEquals(title,"https://keralaproperty.in/member/login/success");
		soft.assertTrue(driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]")).isDisplayed(),"login not displayed");
		System.out.println("continue");
		soft.assertAll();
		
	}


}
