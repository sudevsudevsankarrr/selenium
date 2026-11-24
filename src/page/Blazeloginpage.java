package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazeloginpage {
	WebDriver driver;
	
	By Bname=By.id("name");
	By Bcompany=By.id("company");
	By Bmail=By.id("email");
	By Bpassword=By.id("password");
	By Brepass=By.id("password-confirm");
	By Bregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazeloginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String blname,String blcompany,String blemail,String blpassword,String blpasswordcomfirm )
	{
		driver.findElement(Bname).sendKeys(blname);
		driver.findElement(Bcompany).sendKeys(blcompany);
		driver.findElement(Bmail).sendKeys(blemail);
		driver.findElement(Bpassword).sendKeys(blpassword);
		driver.findElement(Brepass).sendKeys(blpasswordcomfirm);
		
	}
	public void login()
	{
		driver.findElement(Bregister).click();
	}

}
