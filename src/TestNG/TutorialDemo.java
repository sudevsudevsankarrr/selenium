package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialDemo {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setlink()
	{
		driver.manage().window().maximize();
			
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void t1() throws IOException, InterruptedException
	{
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		
		 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		 
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys("vava");
		driver.findElement(By.name("lastname")).sendKeys("vavu");
		driver.findElement(By.name("email")).sendKeys("vavachiii5@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9655782330");
		driver.findElement(By.id("input-password")).sendKeys("vava@vavachii");
		driver.findElement(By.name("confirm")).sendKeys("vava@vavachii");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		
		
		
		WebElement S =driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input"));
		File S1=S.getScreenshotAs(OutputType.FILE);	
		FileHandler.copy(S1,new File("E:\\Screenshot\\/screenshotemail.png"));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();

		
		String contant=driver.getPageSource();
		if(contant.contains("Account success"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();

	driver.executeScript("window.scrollTo(0, document.body.scrollHeight");
		
//		WebElement e=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
//		File e1=e.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy( e1,new File("E:\\\\Screenshot\\\\/screenshotwebelement.png"));
//		
//		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[1]/div/input")).sendKeys("vava");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[2]/div/input")).sendKeys("vava2gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[3]/div/textarea")).sendKeys("Ente bharthavine pidichu ente kochite achane");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input")).click();

		
		

		
	}
	

}
