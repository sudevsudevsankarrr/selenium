package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void logintest()
	{
		driver.findElement(By.id("user-name")).sendKeys("fhaaaa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123546@5");
		driver.findElement(By.id("login-button")).click();
	}
	@Test
	public void titletest()
	{
		String title=driver.getTitle();
		String extitle="swag lab";
		if(title.equals(extitle))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
	}
	
	@Test
	public void contest()
	{
		String content=driver.getPageSource();
		String c="Accepted usernames are:";
		if(content.contains(c))
		{
			System.out.println("Pass");
	    }
		else
		{
			System.out.println("Fail");
		}
	}

}
