package TestNG;

import org.testng.annotations.Test;

public class TestNGgrouping {
	@Test
	public void setup()
	{
		System.out.println("this is main");
	}
	@Test(groups= {"sanity","smoke"})
	public void main2()
	{
		System.out.println("this is main 2");
	}
	@Test(groups= {"regression"})
	public void main3()
	{
		System.out.println("thi si main 3");
	}
	@Test(groups={"sanity","regression"})
	public void main4()
	{
		System.out.println("this is main4");
	}
	@Test(groups= {"regression"})
	public void main5()
	{
		System.out.println("this is main");
		
	}

}
