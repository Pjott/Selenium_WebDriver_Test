package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_One {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/pitr/Intellij_Projects/Selenium_Test_Formy/resources/chromedriver");
		driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com";
		String expectedSiteTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(url);
		actualTitle = driver.getTitle();
		
		//comparing the actual title of the page with expected one
		String passedTest = "Test Passed!";
		String failedTest = "Test Failed!";
		if (actualTitle.contentEquals(expectedSiteTitle)) {
			System.out.println(passedTest);
		} else {
			System.out.println(failedTest);
		}
		driver.close();
		System.exit(0);
	}

}
