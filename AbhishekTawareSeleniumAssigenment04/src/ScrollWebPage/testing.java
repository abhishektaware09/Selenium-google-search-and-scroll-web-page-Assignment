package ScrollWebPage;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	
	WebDriver driver;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor) driver; 
		javascriptexecutor.executeScript("window.scrollBy(0,1000)");
	}

}
