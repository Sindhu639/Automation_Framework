package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Sindhu");
		driver.findElement(By.id("lastName")).sendKeys("sind");
driver.findElement(By.id("userEmail")).sendKeys("sindhu@example.com");
driver.findElement(By.id("userNumber")).sendKeys("9632954420");
 //driver.findElement(By.id("dateOfBirthInput")).click();
driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
	}

}
