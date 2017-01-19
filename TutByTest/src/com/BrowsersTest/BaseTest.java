package com.BrowsersTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public void runBaseTest(Browsers browser) throws InterruptedException {

		WebDriver driver;

		switch (browser) {

		case FireFox:

			System.setProperty("webdriver.gecko.driver", "./src/Recources/geckodriver.exe");

			driver = new FirefoxDriver();

			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			TestFlowTutBy.testFlowSteps(driver, browser);

			TestFlowGmail.testFlowSteps(driver);

			break;

		case Chrome:

			System.setProperty("webdriver.chrome.driver", "./src/Recources/chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			TestFlowTutBy.testFlowSteps(driver, browser);

			TestFlowGmail.testFlowSteps(driver);

			break;
		}
	}
}
