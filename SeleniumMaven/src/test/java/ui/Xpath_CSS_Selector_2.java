package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//CSS Selector - By Class
public class Xpath_CSS_Selector_2 {

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

		driver.get("https://saucedemo.com");
		
		driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("TEST");
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("TEST");
		
//		driver.close();

	}
}
