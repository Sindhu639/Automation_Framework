package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kannadalocation
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.dreiver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath(//button[@name='login']"));
		  
		String b=ele.getText();
		System.out.println(b);
}
}
