package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class href 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	for (WebElement webElement : links)
	{
		 String ref =webElement.getAttribute("href");
		 System.out.println(ref);
	}
}
}
