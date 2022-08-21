package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_WebElements_AutoSuggest {

	public static String browser = "chrome"; // External configuration - XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://www.mytrip.com/rf/start");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		WebElement fromTrip = driver.findElement(By.xpath("//input[@id='searchForm-singleBound-origin-input']"));
		fromTrip.sendKeys("Dhaka");
		Thread.sleep(2000);
		// fromTrip.sendKeys(Keys.ARROW_DOWN);
		// Thread.sleep(2000);
		fromTrip.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();

	}
}
