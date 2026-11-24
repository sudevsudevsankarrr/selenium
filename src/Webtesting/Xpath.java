package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/success");
	}
	@Test
	public void logtest()
	{
		driver.findElement(By.xpath("//input[@name=\"ulogin\"]")).sendKeys("sudevsudevsankar@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"upass\"]")).sendKeys("Sudev@2006");
		driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]")).click();
		
	}

}
