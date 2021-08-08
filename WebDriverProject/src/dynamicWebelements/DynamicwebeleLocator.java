package dynamicWebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicwebeleLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\New folder (5)\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
		//d.findElement(By.xpath("//a[text()='मराठी']")).click();
		d.findElement(By.xpath("//input[@title='Search']")).sendKeys("a");
	}

}
