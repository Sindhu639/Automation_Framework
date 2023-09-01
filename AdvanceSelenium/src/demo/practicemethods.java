package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicemethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		//Thread.sleep(2000);
	// String url = driver.getCurrentUrl();
	// System.out.println(url);
	// String tit = driver.getTitle();
	// System.out.println(tit);
	// String pag = driver.getPageSource();
	// System.out.println(pag);
		//Dimension d=new Dimension(400,300);
		//driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.name("login"));
	//	int h=ele.getSize().getWidth();
		//System.out.println(h);
	//	int w = ele.getSize().getWidth();
		//System.out.println(w);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Dimension d=new Dimension(300, 400);
		driver.manage().window().setSize(d);
			//WebElement ele=driver.findElement(By.xpath(null))
		
		

		
		
}
}
