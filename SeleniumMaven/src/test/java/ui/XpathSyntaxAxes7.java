package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//XPath Axes - Parent, Child, Self
public class XpathSyntaxAxes7 {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://developer.salesforce.com/signup");
		
		// Parent
		driver.findElement(By.xpath("//select[@name='country']//parent::form")).sendKeys("Typing Text...");

		// Child
		driver.findElement(By.xpath("//select[@name='country']//child::option[2]]")).sendKeys("Password");
		
		// Self
		driver.findElement(By.xpath("//input[@placeholder='Password' and @type='password']")).sendKeys("Password");

	}

}
