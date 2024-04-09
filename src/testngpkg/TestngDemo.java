package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
	
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		System.out.println("beforetest");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		System.out.println("url loading");
	}
	
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups = {"smoke","sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups = {"sanity"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups = {"regression"})
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(groups = {"smoke","regression"})
	public void test5()
	{
		System.out.println("test5");
	}

	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("aftertest");
	}
}
