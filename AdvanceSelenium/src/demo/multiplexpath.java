package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplexpath
{public static void main(String[] args) throws InterruptedException 
{System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sindhub123@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}

}
