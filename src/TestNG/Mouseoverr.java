package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouseoverr {
	WebDriver driver;

	@BeforeTest
	public void setup()
	{

		driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void hard()
	{
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");
		driver.navigate().to("https://www.ebay.com/");

		
	}
	@Test
	public void test1()
	{
		WebElement e=driver.findElement(By.xpath("/html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/a"));
		Actions a=new Actions(driver);
		a.moveToElement(e);
		a.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("/html/body/main/div[1]/div/div[1]/div/div/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	}

}
