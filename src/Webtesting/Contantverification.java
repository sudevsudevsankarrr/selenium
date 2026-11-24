package Webtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contantverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualcontent=driver.getPageSource();
	
		 if(actualcontent.contains("Gmail"))
		 {
			 System.out.println("Pass");
        }
		 else {
			 System.out.println("fail");
		 }
        

	}

}
