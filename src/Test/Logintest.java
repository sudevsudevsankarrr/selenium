package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Loginpage;

public class Logintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void ltest()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void logintest()
	{
		Loginpage ob=new Loginpage(driver);
		ob.setvalues("abd@gmail.com", "00000000");
		ob.login();
		
	}

}
