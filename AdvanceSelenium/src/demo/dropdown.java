package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/selectmultiple.html");
	WebElement ele = driver.findElement(By.id("countries"));
	Select s = new Select(ele);
	s.selectByIndex(1);
	Thread.sleep(2000);
	s.selectByValue("k");
	Thread.sleep(2000);
	s.selectByVisibleText("Thailand");
	Thread.sleep(2000);
	s.deselectAll();

	
	
}
}
