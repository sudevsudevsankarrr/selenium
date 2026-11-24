package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Blazeloginpage;

public class Blazelogin {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void loginmethod()
	{
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void logintest()
	{
		Blazeloginpage ob=new Blazeloginpage(driver);
		ob.setvalues("Abhijith", "Tatalimited", "abhi@gmail.com","Abhi@2008","Abhi@2008");
		ob.login();
		
	}

}
