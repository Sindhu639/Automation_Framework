package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunch {

	public static void main(String[] args) 
	{
		String Key="webdriver.chrome.driver";
		//browser to launch
		String valve="./softwares/chromedriver.exe";
		//path of the drivers
		System.setProperty(Key, valve);
		ChromeDriver driver=new ChromeDriver();
	

	}

}
