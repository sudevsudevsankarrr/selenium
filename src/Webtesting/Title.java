package Webtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		
		String expectedtitle="goooglee";
		
        if (actualtitle.equals(expectedtitle)) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

				
		

	}

}
