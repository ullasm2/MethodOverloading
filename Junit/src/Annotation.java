import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Annotation {

	static WebDriver Driver;
	
	@BeforeClass
	
	public static void Launch() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");

		Driver = new ChromeDriver();
		
		Driver.get("http://www.greenstechnologys.com");
		
		
}
	
	@AfterClass
			
public static void Close()
	{
	//Driver.close();
	
	}

	@Before
	
	public void startTime()	{
		
		Date d = new Date();
		System.out.println(d);
				
	}
	
	@After
		
	
		public void endtime() {
			
			Date t = new Date();
			System.out.println(t);
			
		}
	
	@Test
	
	public void logic()
	{
		WebElement MouseO1 = Driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc = new Actions(Driver);
		acc.moveToElement(MouseO1).perform();
		
		
		
		WebElement MouseO2 = Driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		Actions abd = new Actions(Driver);
		abd.moveToElement(MouseO2).perform();
		
		WebElement clk = Driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Training']"));
		clk.click();
		
		
			
	
	
	
	
	
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
}
