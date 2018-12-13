package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Two {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/pitr/Intellij_Projects/Selenium_Test_Formy/resources/chromedriver");
		driver = new ChromeDriver();
		String url = "http://facebook.com";
		String tagName = "";
		driver.get(url);
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);

	}

}
