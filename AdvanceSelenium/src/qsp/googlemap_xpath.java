package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap_xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='gb_Of gb_x']")).click();
		Thread.sleep(2000);
	}
}
