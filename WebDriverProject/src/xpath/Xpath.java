package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		//setting path of chrome driver	
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (5)\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.get("http://rediff.com");
		d.manage().window().maximize();
		
		//find elements
		d.findElement(By.xpath("//Img[@alt='Stars give us SUMMER VIBES!']")).click();
	}

}
