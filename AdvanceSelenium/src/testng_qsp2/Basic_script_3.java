package testng_qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic_script_3 
{

	@Test
	public void data1()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
	    String txt = ele.getText();
		Reporter.log("txt",true);
	}
}
