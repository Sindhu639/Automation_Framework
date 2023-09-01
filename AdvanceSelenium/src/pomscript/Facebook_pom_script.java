package pomscript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Facebook_pom_script 
{
@FindBy(name="email")
private WebElement emailTbox;
@FindBy(name="pass")
private WebElement pwdTbox;
@FindBy(name="login")
private WebElement loginBtn;
public Facebook_pom_script(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
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