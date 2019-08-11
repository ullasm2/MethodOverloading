package org.india.Myntra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\Myntra\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[text()='desktop-searchBar']"));
	search.sendKeys("Iphonex");
	
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	driver.findElement(By.xpath("//div[text()='SWISS MILITARY']")).click();
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	for(String x:all) {
		
		if(!parent.equals(x)) {
			
			driver.switchTo().window(x);
			
			
			driver.findElement(By.xpath("//a{text()='GO TO BAG']")).click();
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
		

		
		
		
		
	}

}
