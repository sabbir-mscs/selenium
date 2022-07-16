package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "firefox";  //External configuration - XLS, CSV
	public static WebDriver driver;
//	public static FirefoxDriver driver;
//	public static ChromeDriver driver1;
	
	public static void main(String[] args) { 
		
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//		driver.findElement(By.linkText("Locators")).click();
//		WebElement passField = driver.findElement(By.id("password"));
		
//		driver.findElement(withTagName("input").above(passField)).sendKeys("Testing");
	}

}
