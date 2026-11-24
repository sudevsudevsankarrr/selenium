package TestNG;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HardAssertprgm {
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void hard()
	{
		driver.get("https://keralaproperty.in/");
		
	}
	@Test
	public void test1()
	{
		String actual =driver.getTitle();
		String expected="www.facebook.com";
		
		Assert.assertEquals(actual,expected,"title verified");
		System.out.println("title");
		
	}
	@Test
	public void tesr2()
	{
		WebElement search=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/a[1]"));
		boolean searchenable=search.isEnabled();
		Assert.assertTrue(searchenable, "it is not enanbled");
	}
		
}

