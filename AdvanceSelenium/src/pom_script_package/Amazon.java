package pom_script_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script_package.Generic_script;

public class Amazon extends Generic_script
{
@FindBy(id="twotabsearchtextbox")
private WebElement searchbox;
@FindBy(xpath="//input[@type='submit']")
private WebElement searchTbox;

 public Amazon(WebDriver driver)
 {
	PageFactory.initElements(driver,this); 
	 
 }
 public void searh(String cloths)
 {
	 searchbox.sendKeys(cloths);
 }
 public void clickbtn()
 {
	 searchTbox.click();
 }
 }