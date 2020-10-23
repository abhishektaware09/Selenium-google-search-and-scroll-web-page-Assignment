package GoogleSearch;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	
	WebDriver driver;
	String url="https://www.google.com";

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
	public void test() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> WE= driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		
		for(int i=0;i<WE.size();i++) {
			String val = WE.get(i).getText();
			if(val.equals("selenium webdriver")) {
				WE.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		
		
	}

}
