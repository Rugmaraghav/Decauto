package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FbloginPage;

public class Fblogintest extends Baseclass{
	
	
	@Test
	public void test()
	{

		FbloginPage ob=new FbloginPage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.loginclick();
	}
	
	
	
	
	

}
