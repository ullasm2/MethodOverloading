import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\eclipse-workspace\\SeleniumD2Q1\\driver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String tl = driver.getTitle();
		System.out.println(tl);
		
		driver.manage().window().maximize();
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("cshree777@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("pass");
		
		WebElement clk = driver.findElement(By.id("u_0_2"));
		clk.click();
		
		
		
		
		
		
		
		
	}

}
