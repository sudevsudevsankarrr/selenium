package testtool;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagetool.Toolpage;

public class Tooltest {
	WebDriver driver;
	String baseurl="https://www.toolsqa.com/";
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
		
	}
	@BeforeMethod
	public void toolmethod()
	{
		driver.get(baseurl);
	}
	@Test
	public void tooltest() throws IOException {
		Toolpage ob=new Toolpage(driver);
		ob.checklink();
		ob.newtab();
	}

}
