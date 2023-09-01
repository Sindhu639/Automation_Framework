package testng_qsp2;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic_practice_4 
{
@Test
public void data22()
{
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> ele = driver.findElements(By.xpath("//img"));
		for(WebElement we:ele)
		{
			String source = we.getAttribute("src");
			Reporter.log("source",true);

	}
	}
	
}
@Test
public void data23()
{
	Date d=new Date();
	Reporter.log("d",true);
}
}
