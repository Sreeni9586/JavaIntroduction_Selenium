package mySeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		//Selenium Manager
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.navigate();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
