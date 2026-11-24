package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class keralainitpgm {
	WebDriver driver;
	@FindBy(name="ulogin") WebElement KPemail;
	@FindBy(name="upass") WebElement KPpass;
	@FindBy(id="sub_logbtn") WebElement KPlogin;
	
	public void keralainitpgm(WebDrriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setvalues(String email,String password)
	{
		KPemail.sendKeys(email);
		KPpass.sendKeys(password);
		KPlogin.click();
	}
	

}
