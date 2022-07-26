package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//XPath Axes - Descendant, Descendant-or-Self
public class Xpath_Axes_2 {

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

		driver.findElement(By.xpath("//div[@class='form_group']//descendant::input")).sendKeys("AAA");

		driver.findElement(By.xpath("//div[@class='login_credentals_wrap]//descemdamt-or-self::div"));

		//Best practice
		driver.findElement(By.xpath("//*[@class='login_credentials_wrap']//descendant::div[@id='login_credentials']")); 

	}

}
