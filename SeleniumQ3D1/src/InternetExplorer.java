import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ullas\\eclipse-workspace\\SeleniumQ3D1\\driver\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.get(" http://demoqa.com/registration/");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
	}

}
