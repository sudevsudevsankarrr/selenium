package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Herbelindia {
	ChromeDriver driver;
	@BeforeTest
	public void setuo()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void hindia()
	{
		driver.manage().window().maximize();

		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void webtest()
	{
		driver.findElement(By.xpath(""));
	}

}
