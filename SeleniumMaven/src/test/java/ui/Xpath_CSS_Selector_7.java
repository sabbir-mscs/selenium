package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//CSS Selector - Pseudo-classes | First-Child, Last-Child, Nth-Child, Nth-Last-Child
public class Xpath_CSS_Selector_7 {

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

		// first-child
		driver.findElement(By.className("select#job_role>:first-child")).sendKeys(args);

		// last-child
		driver.findElement(By.className("select#job_role>:last-child")).sendKeys(args);

		// nth-child
		driver.findElement(By.className("select#job_role>:nth-child(4)")).sendKeys(args);

		// nth-last-child
		driver.findElement(By.className("select#job_role>:nth-last-child(2)")).sendKeys(args);

		// driver.close();

	}
}
