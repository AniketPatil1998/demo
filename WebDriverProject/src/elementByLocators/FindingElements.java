package elementByLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder (5)\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.w3schools.com");
		//d.findElement(By.linkText("Learn Java")).click();
	//d.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
	//d.findElement(By.xpath("//input[@name='search']")).sendKeys("java");
	//d.findElement(By.className("gsc-search-button gsc-search-button-v2")).click();
	//d.findElement(By.linkText("Learn Java")).click();
	//d.findElement(By.partialLinkText("Java Strings")).click();
	
//		List<WebElement> list= d.findElements(By.tagName("a"));
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++) {
//			//System.out.println(list.get(i).getText());
//		if(list.get(i).getText().equals("Learn HTML")) {
//			list.get(i).click();
//			break;
//		}
//			
//		}
	//d.close();
	}

}
