package qsp.handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_disabled_elements 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
	Point lcn = ele.getLocation();
	System.out.println(lcn);
	int x=lcn.getX();
	System.out.println(x);
	int y=lcn.getY();
	System.out.println();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	ele.click();
	
	
	
}
}
