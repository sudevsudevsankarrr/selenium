package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	@Test
	public void alerttest()
	{

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		
		

		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		Alert b=driver.switchTo().alert();
		String e=b.getText();
		System.out.println(e);
		String exp="Click for JS Confirm";
		if(e.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		 b.accept();
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		 Alert c=driver.switchTo().alert();
		 c.sendKeys("yahhhh");
		 c.accept();
		 
		 
		 
		 
		 

		
		
		
		
		
	}
	

}
