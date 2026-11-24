package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kerala {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("ulogin")).sendKeys("sudevsudevsankar@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("Sudev@2006");
		driver.findElement(By.id("sub_logbtn")).click();
	}

}
