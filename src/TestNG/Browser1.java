package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser1 {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void test(String bro)
	{
	if(bro.equalsIgnoreCase("firefox"))	
	{
		driver=new FirefoxDriver();
		
	}
	else if(bro.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(bro.equalsIgnoreCase("Edge"))
	{
		driver=new EdgeDriver();
	}
	}	

	@Test
	public void fb() {
	    driver.get("https://www.facebook.com");
	}

}
