package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Display {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void disply()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void displytest()
	{
		boolean b1= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img")).isDisplayed();
		if(b1)
		{
			System.out.println("displyed");
		}
		else
		{
			System.out.println("not displayed");
		}
		boolean b2=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[1]/input")).isSelected();
		if(b2)
		{
			System.out.println("displyed");
		}
		else
		{
			System.out.println("not displayed");
		}
		boolean b3= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[15]/div/input")).isSelected();
		if(b3)
		{
			System.out.println("displyed");
		}
		else
		{
			System.out.println("not displayed");
		}
	}

}
