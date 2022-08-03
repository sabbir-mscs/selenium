package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Interface_2 {

	public static String browser = "firefox"; // External configuration - XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) {

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

		//get() 	
		driver.get("https://saucedemo.com");
		//manage()
		driver.manage().window().maximize();
		//getCurrentUrl()
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		//getTitle()
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		//pageSource()
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		//navigate
		driver.navigate().to("https://developer.salesforce.com/signup");
		//quit() or close()
		driver.close();

	}
}
