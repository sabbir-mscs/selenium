package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//CSS Selector - Substring Matching
public class Xpath_CSS_Selector_4 {

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

		driver.get("https://saucedemo.com/");
		
		//prefix
		driver.findElement(By.className("input[id^='login']")).sendKeys(args);
		
		//suffix
		driver.findElement(By.className("input[id$='-button']")).sendKeys(args);
		
		//sub-string
		driver.findElement(By.className("input[id*='in']")).sendKeys(args);
		
		
		
//		driver.close();

	}
}
