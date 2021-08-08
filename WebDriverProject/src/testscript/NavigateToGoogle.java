package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogle {

	public static void main(String[] args) {
	//setting path of chrome driver	
	//System.setProperty("webdriver.chrome.driver", "F:\\New folder (5)\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "G:\\SELENIUM START\\geckodriver.exe");	
	//Creating webdriver
	WebDriver d=new FirefoxDriver();
	//Opening website by get
	d.get("http://www.google.com");
	
	//to maximize Window
	d.manage().window().maximize();
}
}
