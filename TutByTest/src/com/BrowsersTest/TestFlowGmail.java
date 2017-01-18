package com.BrowsersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFlowGmail {

	private static final int WAITING = 10;

	public static void testFlowSteps(WebDriver driver) throws InterruptedException {

		driver.get("https://gmail.com/");

		WebElement emailField = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));

		emailField.sendKeys("WebDriverTest01");

		WebElement nextbutton = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("signIn")));

		nextbutton.submit();

		WebElement passwdField = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));

				
		passwdField.sendKeys("QA123456789");

		nextbutton.submit();

		WebElement composeButton = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class='aic']/div/div")));

		composeButton.click();

		WebElement toField = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@name='to']")));

		toField.sendKeys("WebDriverTest01@gmail.com");

		WebElement subjectField = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='subjectbox']")));

		subjectField.sendKeys("Hello world");

		WebElement messageBoby = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@aria-label='Message Body']")));

		messageBoby.sendKeys("Test Automation");

		WebElement sendButton = (new WebDriverWait(driver, WAITING)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='button' and text()='Send']")));

		sendButton.click();

		WebElement viewMessage = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("link_vsm")));

		viewMessage.isDisplayed();

		ElementPresence.isElementPresent(driver, By.id("link_vsm"));

		WebElement inboxButton = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span/a")));

		inboxButton.click();

		WebElement newMail = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//b[1][text()='Hello world']")));

		newMail.isDisplayed();

		WebElement firstMail = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[4]/div[2]")));

		firstMail.click();

		WebElement messageText = (new WebDriverWait(driver, WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[1][text()='Test Automation']")));

		messageText.isDisplayed();
		
		inboxButton.click();

		driver.quit();
	}
}
