package generic_script_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_script 
{
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
}
	@AfterMethod
	public void closeappln()
	{
		driver.close();
	}
}