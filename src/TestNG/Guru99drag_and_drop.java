package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99drag_and_drop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void ddmethod()
	{
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void ddtest() throws InterruptedException
	{
		
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		
		Thread.sleep(2000);
		
		WebElement drag2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(drag2, drop2);
		act2.perform();
	
		Thread.sleep(5000);
		
		
		WebElement drag3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement drop3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions act3=new Actions(driver);
		act3.dragAndDrop(drag3, drop3);
		act3.perform();
		
		Thread.sleep(2000);
		

		WebElement drag4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act4=new Actions(driver);
		act4.dragAndDrop(drag4, drop4);
		act4.perform();
		


		

		

		
		
	}

}
