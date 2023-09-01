package qsp;

import java.awt.AWTException;
import java.awt.KeyEventPostProcessor;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class inspect_tabs {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
	  WebElement t2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
	  WebElement t3 = driver.findElement(By.xpath("//span[text()='Projects']"));
	  WebElement t4 = driver.findElement(By.xpath("//span[text()='Support']"));
	  WebElement t5 = driver.findElement(By.xpath("//span[text()='Blog']"));
	  ArrayList<WebElement> l = new ArrayList<>();
	  
	  l.add(t2);
	  l.add(t3);
	  l.add(t4);
	  l.add(t5);
	  Thread.sleep(2000);
		 Robot r = new Robot();
	  for (WebElement a : l) 
	  {
		   Actions act = new Actions(driver);
			 act.contextClick(a).perform();
			 Thread.sleep(2000);

			 Thread.sleep(2000);
			 r.keyPress(KeyEvent.VK_T);
			 r.keyRelease(KeyEvent.VK_T);
			 	
	}
Set<String> w = driver.getWindowHandles();
ArrayList<String> l2 =new ArrayList<>(w);
String w1 = l2.get(3);
driver.switchTo().window(w1);

	 
	 
	 
	 
	 

	}

}
