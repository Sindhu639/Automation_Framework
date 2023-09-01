package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerClass 
{
@Test
public void click1() throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Facebook_pom_script P1=new Facebook_pom_script(driver);
P1.email("admin");
Thread.sleep(2000);
P1.password("sindhu123");
Thread.sleep(2000);
P1.clicklogin();
}
}
