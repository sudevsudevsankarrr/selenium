package Webtesting;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
	}
	@Test
	public void screshtest() throws IOException
	{
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src,new File("E://error7.png"));
		
		WebElement delement=driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[2]/div[1]/div[1]/a[1]/img[1]"));
		File src1=delement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Screenshot//Elementscreenshot1.png"));
	  
		
	
	}

}

