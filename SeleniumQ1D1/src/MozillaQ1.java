import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaQ1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ullas\\eclipse-workspace\\SeleniumQ1D1\\driver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.amazon.in");
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
			
		
	}

}
