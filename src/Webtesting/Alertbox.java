package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/ENotes/Alertbox.html");
	}
	@Test
	public void alerttest()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String actualtext=a.getText();
		String expectedtext="Hello !,I am suresh!!";
		if(actualtext.equals(expectedtext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sudev");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("hfjv");
		
	}
	

}
