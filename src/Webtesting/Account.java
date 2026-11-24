package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void atext()
	{
		WebElement str=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[20]/input"));
		String name=str.getAttribute("value");
		System.out.println(name);
		String expectedtext="Create My account";
		if(name.equals(expectedtext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}
	
}
