import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_excel 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","./oftwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("sindhubgowda3321@gmail.com");
	
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.name("login")).click();
	
	
	
}
}
