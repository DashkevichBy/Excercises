package EbayDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFlowEbay {

	public static void testFlowSteps(WebDriver driver) {

		driver.get("http://www.ebay.com/");

		Actions builder = new Actions(driver);

		WebElement electroButton = (new WebDriverWait(driver, ActionsTest.WAITING)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(),'Электроника')])[2]")));

		builder.moveToElement(electroButton).build().perform();

		WebElement iPhoneItem = (new WebDriverWait(driver, ActionsTest.WAITING))
				.until(ExpectedConditions.presenceOfElementLocated(By.linkText("iPhone")));

		builder.moveToElement(iPhoneItem).click().build().perform();

		WebElement accessories = (new WebDriverWait(driver, ActionsTest.WAITING)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//a/span[text()='Аксессуары для iPhone']")));

		builder.moveToElement(accessories).click().build().perform();

		ElementPresence.isElementPresent(driver, By.xpath(".//a[text()='Все аксессуары iPhone']"));
		
		
	}
}
