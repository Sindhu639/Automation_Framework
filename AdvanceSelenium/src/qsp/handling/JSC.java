package qsp.handling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSC {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pumashoes");
driver.findElement(By.xpath("//input[@value='Go']")).click();
driver.findElement(By.xpath("//img[@class='s-image']")).click();
Thread.sleep(2000);
Set<String> w = driver.getWindowHandles();	
ArrayList<String> l=new ArrayList<>(w);
String w1 = l.get(1);
driver.switchTo().window(w1);
WebElement ele = driver.findElement(By.id("buy-now-button"));
Point loc = ele.getLocation();
int x = loc.getX();
int y = loc.getY();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy("+x+","+y+")");
ele.click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9632954420");
driver.findElement(By.id("continue")).click();
}

}
