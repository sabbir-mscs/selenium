package ui;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_WebElements_Checkbox {

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

		driver.get("file:///C:/Users/SABBIR/Desktop/test.html");
		driver.manage().window().maximize();

		WebElement findForm2 = driver.findElement(By.id("form2"));

		Actions actions = new Actions(driver);
		actions.moveToElement(findForm2);
		actions.perform();

		driver.findElement(By.id("vehicle1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vehicle2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vehicle3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vehicle1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vehicle2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vehicle3")).click();
		Thread.sleep(1000);

		System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.close();
	}
}
