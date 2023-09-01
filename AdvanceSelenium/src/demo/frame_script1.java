package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_script1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/admin/Desktop/main%20page%20source.html");
	driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("sind");
	Thread.sleep(2000);
	WebElement frame = driver.findElement(By.tagName("iframe"));
	
	
	
}
}
