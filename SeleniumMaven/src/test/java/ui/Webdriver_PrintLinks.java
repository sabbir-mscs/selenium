package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_PrintLinks {

	public static String browser = "chrome"; // External configuration - XLS, CSV
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

		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().window().maximize();

		List<WebElement> allAnchorTags = driver.findElements(By.tagName("a"));
		System.out.println("Total anchor tags: " + allAnchorTags.size());

		// 0-369 will complete counting total 370 anchor tags
		for (int i = 0; i < allAnchorTags.size(); i++) {
			System.out.println("Links on the pages are: " +
					allAnchorTags.get(i).getAttribute("href"));
			System.out.println("Texts on the pages are: " +
					allAnchorTags.get(i).getText());
		}

		// !Try on another site
		driver.navigate().to("https://auth.applitools.com/users/register");
		List<WebElement> optionTag = driver.findElements(By.tagName("option"));
		System.out.println("Total no. of OPTION Tags: " + optionTag.size());

		for (int i = 0; i < optionTag.size(); i++) {
			System.out.println("Option values: " + optionTag.get(i).getAttribute("value"));
		}

		driver.close();

	}
}
