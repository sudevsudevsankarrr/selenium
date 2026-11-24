package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rishiherbal {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.manage().window().maximize();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void Herbtest() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		SoftAssert soft=new SoftAssert();
		String title =driver.getTitle();
		soft.assertEquals(title, "Herbal products |Rishi Herbal India");
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"outOfStockFilter\"]")).click();
		WebElement e=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		e.sendKeys("supper helth");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
		
		
//		 WebElement delement=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a"));
//		 File src=delement.getScreenshotAs(OutputType.FILE);
//		 FileHandler.copy(src,new File("./Screenshots//baby.png"));
		
		Thread.sleep(300);
		
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select s=new Select(drop);
		s.selectByValue("alphabet-asc");
		
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
		WebElement sc=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[14]/div/div/div[1]/div/a/img"));
		
		
		
		
		
		
		
		
		
	}

}
