package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void siteopen()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

	}
	@Test
	public void Daytest() throws InterruptedException
	{
		WebElement A=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
	    Select i=new Select(A);
	    i.selectByValue("10");
	    Thread.sleep(200);
	    List<WebElement> count=i.getOptions();
	    System.out.println(count.size());
	    
	    
	    WebElement month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		Select m=new Select(month);
		m.selectByVisibleText("JAN");
		Thread.sleep(200);
		 List<WebElement> count1=m.getOptions();
		    System.out.println(count.size());
	    
	
		WebElement year=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		Select y=new Select(year);
		y.selectByIndex(4);
		Thread.sleep(200);
		 List<WebElement> count2=y.getOptions();
		    System.out.println(count.size());

	}
	
	
	

}
