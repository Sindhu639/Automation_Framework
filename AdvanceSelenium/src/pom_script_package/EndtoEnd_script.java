package pom_script_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class EndtoEnd_script 
{
@FindBy(xpath="//a[text()='Login']")
public WebElement loginLink;

@FindBy(id="email")
public WebElement emailTBox;

@FindBy(id="password")
public WebElement pwdTBox;

@FindBy(id="loginBtn")
public WebElement loginBtn;

@FindBy(xpath="//img[@alt='qspiders job portal']")
public WebElement logo;

@FindBy(xpath="//input[@name='q']")
public WebElement whaTBox;

@FindBy(xpath="//label[text()='search']")
public WebElement searchBtn;

@FindBy(xpath="//label[text()='Full-time']")
public WebElement checkBox;

public EndtoEnd_script(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void login1()
{
	loginLink.click();
}
public void emAddress(String em)
{
	emailTBox.sendKeys(em);
}
public void password(String pwd)
{
	pwdTBox.sendKeys(pwd);
}
public void login2()
{
	loginBtn.click();
}
public void appLogo()
{
	logo.click();
}
public void whatSearch()
{
	whaTBox.sendKeys("software");
}


public void search()
{
	searchBtn.clear();
}
public void jobTypeCBox()
{
	checkBox.click();
}
}
