package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupload2 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void fileM()
	{
		driver.get("https://www.ilovepdf.com/powerpoint_to_pdf");
	}
	@Test
	public void fileuptest() throws AWTException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a")).click();
		fileUpload("E:\\Software_Testing_Presentation_Seventh_Day_High_School.pptx");
	}
	public void fileUpload(String p) throws AWTException
	{
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/button")).click();
		
		

		
	}

}
