package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchtext 
{

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
	Thread.sleep(2000);
	String txt = ele.getText();
	System.out.println(txt);
		  
 
		
	
	
	
		
}
}
