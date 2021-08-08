package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (5)\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("http://www.w3schools.com");
//		d.manage().window().maximize();
		
		d.findElement(By.xpath("//a[@class='w3-button tut-button']")).click();
		//after 
//		d.findElement(By.xpath("//a[text()='HTML Attributes']/following-sibling::a")).click();
		//before
//		d.findElement(By.xpath("//a[text()='HTML Attributes']/preceding-sibling::a")).click();
		
		//d.close();
	}

}
