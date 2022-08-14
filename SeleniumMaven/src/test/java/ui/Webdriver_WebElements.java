package ui;

import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPathExpression;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_WebElements {

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

		driver.get("https://simecsystem.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.name("text-979")).sendKeys("Test Automated Name");
		driver.findElement(By.name("text-979")).clear();

		String gettingAttribute = driver.findElement(By.name("text-979")).getAttribute("class");
		System.out.println("ATTRIBUTE VALUE " + gettingAttribute);

		System.out.println("CSS Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.getCssValue("background-color"));
		System.out.println("Get Size Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.getSize());
		System.out.println("Get Location Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.getLocation());
		System.out.println("Get Text Value: " + driver.findElement(By.xpath("//*[@id=\"contact_field1\"]"))
				.getText());
		System.out.println("Get Tagname Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.getTagName());
		System.out.println("Get Displayed Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.isDisplayed());
		System.out.println("Get Enabled Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.isEnabled());
		System.out.println("Get Selected Value: " + driver.findElement(By.xpath("//*[@id=\"submit_button_system\"]"))
				.isSelected());

	}
}
