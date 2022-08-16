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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_WebElements_DropDown_P1 {

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
		WebElement dropDown = driver.findElement(By.name("topic_select"));

		Select select = new Select(dropDown);

		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("Software Solutions");
		Thread.sleep(2000);
		select.selectByVisibleText("ICT Infrastructure");
		Thread.sleep(2000);
		driver.close();

	}
}
