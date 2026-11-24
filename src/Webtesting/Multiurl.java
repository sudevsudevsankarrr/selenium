package Webtesting;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiurl {
	ChromeDriver driver;
	String base="https://www.google.com/";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(base);
				
	}
	@Test
	public void urltest()
	{
	
		List<WebElement> li=(List<WebElement>) driver.findElement(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement s:li)
			
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(text+":"+link);

		}
	}

}
