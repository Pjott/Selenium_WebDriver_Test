package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Three {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/pitr/Intellij_Projects/Selenium_Test_Formy/resources/chromedriver");
		driver = new ChromeDriver();
		String url = "http://www.popuptest.com/popuptest2.html";
		driver.get(url);
		//closing only parent window
		driver.close();

	}

}
