package Webtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	FirefoxDriver driver;
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_1tmvcmz30t_e&adgrpid=1329311168025487&hvadid=83082281448403&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149664&hvtargid=kwd-83082829756950:loc-90&hydadcr=5650_2502654&mcid=6233a7c588f136ff9af0c63d9f6745bc&msclkid=02faea44dd6017f9923180e54f654133");
		
	}
	@Test
	public void hometest()
	{
		driver.findElement(By.xpath("//form[@id=\"nav-search-bar-form\"]/div[2]/div/input")).sendKeys("Mobile");
		driver.findElement(By.xpath("//header[@id=\"navbar-main\"]/div/div[1]/div[3]/div/a[2]/div[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//header[@id=\"navbar-main\"]/div/div[1]/div[3]/div/div[2]/a/div/span")).click();

		
		
	}
	
	
	

}
