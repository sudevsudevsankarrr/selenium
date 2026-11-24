package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogin {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void regtest()
	{
		driver.findElement(By.xpath("//form[@name=\"register_mail\"]/div/div[2]/input")).sendKeys("Akshay");
		driver.findElement(By.xpath("//form[@name=\"register_mail\"]/div/div[3]/div/input")).sendKeys("Akshayyyy");
		driver.findElement(By.xpath("//form[@name=\"register_mail\"]/div/div[6]/div/input")).sendKeys("Ak@123");
		driver.findElement(By.xpath("//form[@name=\"register_mail\"]/div/div[7]/div/input")).sendKeys("Ak@123");
		
	}

}
