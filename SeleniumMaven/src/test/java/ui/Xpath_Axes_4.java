package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//XPath Axes - Following, Following-sibling
public class Xpath_Axes_4 {

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

		driver.get("https://www.saucedemo.com/");

		//div[@class='login_wrapper-inner']//ancestor::div[@class='login_wrapper'] 
		
		driver.findElement(By.xpath("div[@class='login_wrapper-inner']//following::div[@class='login_wrapper']"));
		
		driver.findElement(By.xpath("div[@class='login_wrapper-inner']//following-sibling::div[@class='login_wrapper']"));

	}

}
