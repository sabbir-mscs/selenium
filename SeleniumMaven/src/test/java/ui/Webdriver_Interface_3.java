package ui;

import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPathExpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Interface_3 {

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

		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		// driver.close();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com/");
		// getWindowHandle()
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		// getWindowHandles()
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[1]/div[4]")).click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

	}
}
