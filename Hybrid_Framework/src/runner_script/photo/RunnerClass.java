package runner_script.photo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_script.Base_Test;
import pom_script.Pom1;


public class RunnerClass extends Base_Test

{
	public WebDriver driver;
	@Test
	public void click1() throws InterruptedException 
	{
    Pom1 P1= new Pom1(driver);
	P1.email("admin");
	Thread.sleep(2000);
	P1.password("sindhu123");
	Thread.sleep(2000);
	P1.clicklogin();
	}
	}

