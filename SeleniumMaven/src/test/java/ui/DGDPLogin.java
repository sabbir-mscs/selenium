package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DGDPLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://10.11.106.130:5200/login");
		driver.findElement(By.xpath("//*[@id=\":R52mlalacm:\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\":R54mlalacm:\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[2]/div[2]/form/button")).click();

		// try logout
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[2]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"account-menu\"]/div[3]/ul/li[2]")).click();

//		driver.close();

	}

}
