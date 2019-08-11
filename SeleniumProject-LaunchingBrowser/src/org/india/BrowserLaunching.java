package org.india;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\SeleniumProject-LaunchingBrowser\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		// Pass the Value
	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hi5ullas5@gmail.com");
		
		WebElement psw = driver.findElement(By.id("pass"));
		psw.sendKeys("abcde@123");
		
		// Click
		WebElement cli = driver.findElement(By.id("u_0_a"));
		cli.click();
		


	}

}
