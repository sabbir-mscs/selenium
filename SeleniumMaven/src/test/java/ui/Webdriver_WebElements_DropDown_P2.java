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

public class Webdriver_WebElements_DropDown_P2 {

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

		WebElement dropDown = driver.findElement(By.name("cars"));

		Select select = new Select(dropDown);
		select.selectByValue("volvo");
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		List<WebElement> allOptions = select.getAllSelectedOptions();
		System.out.println("SIZE OF SELECTED: " + allOptions.size());
		select.deselectAll();

		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.deselectByIndex(0);
		Thread.sleep(2000);
		List<WebElement> allOptions2 = select.getAllSelectedOptions();
		System.out.println("SIZE OF SELECTED 2: " + allOptions2.size());
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);

		// !Tested for another form
		driver.navigate().to("https://auth.applitools.com/users/register");
		WebElement appDropdown = driver.findElement(By.name("country"));

		Select appSelect = new Select(appDropdown);

		WebElement appSelectItem = appSelect.getFirstSelectedOption();
		Thread.sleep(2000);
		System.out.println("FIRST-OPTION " + appSelectItem.getText());
		Thread.sleep(2000);

		driver.close();

	}
}
