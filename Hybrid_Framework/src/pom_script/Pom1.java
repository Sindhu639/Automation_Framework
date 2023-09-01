package pom_script;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.Basepage;

public class Pom1 extends Basepage

{
	@FindBy(name="email")
	private WebElement emailTbox;
	@FindBy(name="pass")
	private WebElement pwdTbox;
	@FindBy(name="login")
	private WebElement loginBtn;
	public Pom1(WebDriver driver)
	{
		super(driver);
		
	}
	public void email(String un)
	{
		emailTbox.sendKeys(un);
		
	}

	public void password(String pwd)
		{
		pwdTbox.sendKeys("pwd");	
	}
		public void clicklogin()
		{
			loginBtn.click();
	}
	}
