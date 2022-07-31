package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//CSS Selector - Pseudo-classes | first-of-type, last-of-type, nth-of-type()
public class Xpath_CSS_Selector_8 {

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

		// first-of-type
		driver.findElement(By.className("form#deorg_form>input:first-of-type")).sendKeys(args);

		// last-of-type
		driver.findElement(By.className("form#deorg_form>input:first-of-type")).sendKeys(args);

		// nth-of-type(2)
		driver.findElement(By.className("select#job_role>:nth-of-type(2)")).sendKeys(args);

		// driver.close();

	}
}
