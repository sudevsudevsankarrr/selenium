package Webtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleprice {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cakehut.in/");
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		
		String expectedtitle="CakeHut";
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Title is correct");
        }
		else
		{
			System.out.println("Title is incorrect");
		}
		ChromeDriver p=new ChromeDriver();
		p.get("https://www.cakehut.in/x-mas-new-year-cakes");
		String content=p.getPageSource();
		String o="Price";
		if(content.contains(o))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

	

	}
