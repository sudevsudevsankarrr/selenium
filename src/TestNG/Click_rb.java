package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click_rb {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	@Test
	public void rtest()
	{
		WebElement right=driver.findElement(By.xpath("/html/body/span"));
		Actions a=new Actions(driver);
		a.contextClick(right);
		a.perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]/span")).click();
		Alert d=driver.switchTo().alert();
		String actualtext=d.getText();
		String expectedtext="clicked: edit";
		if(actualtext.equals(expectedtext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		d.accept();
		
		WebElement doubl=driver.findElement(By.xpath("/html/body/button"));
		Actions ac=new Actions(driver);
		ac.doubleClick(doubl);
		ac.perform();
		Alert v=driver.switchTo().alert();
		v.accept();
		
	

		
	}

}
