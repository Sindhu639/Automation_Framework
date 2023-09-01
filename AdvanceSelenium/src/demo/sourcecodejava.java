package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sourcecodejava 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	List<WebElement> ele = driver.findElements(By.xpath("//img"));
	for(WebElement we:ele)
	{
		String source = we.getAttribute("src");
		System.out.println(source);

}
}
}

