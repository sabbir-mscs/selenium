package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\test_files\\selenium\\selenium-demo\\selenium-tools\\browserdrivers\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "E:\\test_files\\selenium\\selenium-demo\\selenium-tools\\browserdrivers\\geckodriver.exe");
//		System.setProperty("webdriver.edge.driver", "E:\\test_files\\selenium\\selenium-demo\\selenium-tools\\browserdrivers\\msedgedriver.exe");

		
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
		driver.close();
	}

}
