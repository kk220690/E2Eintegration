package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B
{
	@Test
	public void tc_01()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kk\\Desktop\\browser_jar\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");
	}

}
