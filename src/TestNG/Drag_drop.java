package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		
	}
	@Test
	public void droppedtest()
	{
		WebElement drag=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/p/b"));
		WebElement drop=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		String actualtext=drop.getText();
		System.out.println(actualtext);
		if(actualtext.equals("Dropped"))
		{
			System.out.println("Dropped");
		}
		else
		{
			System.out.println("not Dropped");
		}
		
	}

}
