package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Toolspage;

public class Toolstest {
	WebDriver driver;
	String base="https://www.toolsqa.com/";
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		
	}
	@BeforeMethod
	public void toolmethod()
	{
		driver.get(base);
	}
	@Test
	public void test() throws IOException 
	{
		Toolspage ob = new Toolspage(driver);
        ob.checklink();
        ob.newtab();
//        ob.switchtab();

	}
	

}
