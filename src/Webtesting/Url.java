package Webtesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Url {
	ChromeDriver driver;
	String baseurl="https://www.google.com/";
	@Before
	public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			
		}
	@BeforeTest
	public void set()
	{
		driver.manage().window().maximize();
		
	}
		
		@Test
		public void linkcount() throws Exception 
		{
			URL ob=new URL(baseurl);
			 HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			 con.connect();
			 if(con.getResponseCode()==200)
			 {
				 System.out.println("valid url");
			 }
			 else
			 {
				 System.out.println("invalid url");
			 }
		}
	
		
	}


