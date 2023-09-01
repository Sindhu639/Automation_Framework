package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert 
{
	@Test
	public void main() 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		String title = driver.getTitle();
		//Assert.assertEquals(title,"Insta");
		org.testng.asserts.SoftAssert sa= new org.testng.asserts.SoftAssert();
		sa.assertEquals(title,"Insta");
		
		System.out.println("hi");
		sa.assertAll();
	}
}
