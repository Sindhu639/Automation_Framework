package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
//driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.partialLinkText("fo")).click();
}
}

