package pagetool;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Toolpage {
	WebDriver driver;
	By Blink=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/a[1]");
	public Toolpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void openurl(String url)
	{
		driver.get(url);
	}
public void checklink() throws IOException
{
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("no of loink"+ links.size());
	for(WebElement a:links)
	{
		System.out.println(a.getAttribute("href"));
		System.out.println(a.getText());
	}
	String baseurl=("https://www.toolsqa.com/");
	driver.get(baseurl);
	URL ob=new URL(baseurl);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==404)
	{
		System.out.println("invalid url"+baseurl);
		
	}
	else
	{
		System.out.println("valid url"+baseurl);
	}
}


public void newtab()
{
	driver.findElement(Blink).click();
}
public void switchtab() {
String perentwindow=driver.getWindowHandle();
Set<String>windowhandile=driver.getWindowHandles();
for(String haldile:windowhandile)
{
	System.out.println("handile");
	if(!handile.e)
	{
		
	}
}

}
